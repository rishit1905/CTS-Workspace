package com.cts.gscp.dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.cts.gscp.dao.QueryMapper;
import com.cts.gscp.exception.GuitarStoreException;
import com.cts.gscp.model.Guitar;
import com.cts.gscp.exception.GuitarStoreException;
import com.cts.gscp.model.Guitar;
import com.cts.gscp.util.ConnectionProvider;

public class GuitarDAOJDBCImpl implements GuitarDAO {
	
	ConnectionProvider conProvider;
	
	
	public GuitarDAOJDBCImpl() throws GuitarStoreException {
		try {
			conProvider=ConnectionProvider.getInstance();
		} catch (IOException e) {
			throw new GuitarStoreException("Database not reachable");
		}
	}

	@Override
	public String add(Guitar guitar) throws GuitarStoreException {
		String guitarModel = null;
		if (guitar != null) {
			try (Connection con = conProvider.getConnection();
					PreparedStatement pIn = con
							.prepareStatement(QueryMapper.ADD_QUERY)) {

				pIn.setString(1, guitar.getGuitarModel());
				pIn.setString(2, guitar.getGuitarName());
				pIn.setDouble(3, guitar.getPrice());
				pIn.setDate(4, Date.valueOf(guitar.getDateAdded()));

				int rowCount = pIn.executeUpdate();

				if (rowCount == 1) {
					guitarModel = guitar.getGuitarModel();
				}
			} catch (SQLException exp) {
				throw new GuitarStoreException("Guitar is not inserted");
			}
		}
		return guitarModel;
	}

	@Override
	public boolean delete(String guitarModel) throws GuitarStoreException {
		boolean isDone = false;

		try (Connection con = conProvider.getConnection();
				PreparedStatement pDel = con
						.prepareStatement(QueryMapper.DELETE_QUERY)) {

			pDel.setString(1, guitarModel);

			int rowCount = pDel.executeUpdate();

			if (rowCount == 1) {
				isDone = true;
			}
		} catch (SQLException exp) {
			throw new GuitarStoreException("Guitar is not inserted");
		}

		return isDone;
	}

	@Override
	public Guitar get(String guitarModel) throws GuitarStoreException {
		Guitar guitar=null;
		try (Connection con = conProvider.getConnection();
				PreparedStatement pSel = con
						.prepareStatement(QueryMapper.SELECT_QUERY)) {

			pSel.setString(1, guitarModel);

			ResultSet rs = pSel.executeQuery(); 
			
			if(rs.next()){
				guitar = new Guitar();
				guitar.setGuitarModel(rs.getString("guitarmodel"));
				guitar.setGuitarName(rs.getString("guitarname"));
				guitar.setPrice(rs.getDouble("price"));
				guitar.setDateAdded(rs.getDate("dateadded").toLocalDate());
			}
			
		} catch (SQLException exp) {
			throw new GuitarStoreException("Guitar is not available");
		}		
		return guitar;
	}

	@Override
	public List<Guitar> getAll() throws GuitarStoreException {
		List<Guitar> guitars=null;
		try (Connection con = conProvider.getConnection();
				PreparedStatement pSel = con
						.prepareStatement(QueryMapper.GETALL_QUERY)) {

			ResultSet rs = pSel.executeQuery();
			
			guitars = new ArrayList<Guitar>();
			
			while(rs.next()){
				Guitar guitar = new Guitar(); 
				guitar.setGuitarModel(rs.getString("guitarmodel"));
				guitar.setGuitarName(rs.getString("guitarname"));
				guitar.setPrice(rs.getDouble("price"));
				guitar.setDateAdded(rs.getDate("dateadded").toLocalDate());
				guitars.add(guitar);
			}
			
		} catch (SQLException exp) {
			throw new GuitarStoreException("No guitars are available.");
		}		
		return guitars;	
	}

	@Override
	public void persist() throws GuitarStoreException {
		/* no implementation required */
		
	}

	@Override
	public boolean update(Guitar guitar) throws GuitarStoreException {
		/*No implementation*/
		return false;
	}

}
