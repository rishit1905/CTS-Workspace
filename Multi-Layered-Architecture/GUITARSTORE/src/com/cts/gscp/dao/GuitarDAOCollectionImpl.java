package com.cts.gscp.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import com.cts.gscp.exception.GuitarStoreException;
import com.cts.gscp.model.Guitar;

public class GuitarDAOCollectionImpl implements GuitarDAO {
	
	private Map<String, Guitar> guitars;
	
	public GuitarDAOCollectionImpl() throws GuitarStoreException {
		guitars=new TreeMap<>();
	}

	@Override
	public String add(Guitar guitar) throws GuitarStoreException {
		String guitarModel=null;
		if(guitar!=null) {
			guitarModel=guitar.getGuitarModel();
			guitars.put(guitarModel, guitar);
		}
		return guitarModel;
	}

	@Override
	public boolean delete(String guitarModel) throws GuitarStoreException {
		boolean isDone=false;
		if(guitarModel!=null) {
			guitars.remove(guitarModel);
			isDone=true;
		}
		return isDone;
	}

	@Override
	public Guitar get(String guitarModel) throws GuitarStoreException {
		return guitars.get(guitarModel);
	}

	
	@Override
	public List<Guitar> getAll() throws GuitarStoreException {
		return new ArrayList<>(guitars.values());
	}

	@Override
	public boolean update(Guitar guitar) throws GuitarStoreException {
		boolean isDone=false;
		if(guitar!=null) {
			String guitarModel=guitar.getGuitarModel();
			guitars.replace(guitarModel, guitar);
			isDone=true;
		}
		return isDone;
	}

	@Override
	public void persist() throws GuitarStoreException {
		
	}

}
