package com.cts.gscp.service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.cts.gscp.dao.GuitarDAO;
//import com.cts.gscp.dao.GuitarDAOCollectionImpl;
import com.cts.gscp.dao.GuitarDAOIOStreamImpl;
import com.cts.gscp.dao.GuitarDAOJDBCImpl;
import com.cts.gscp.exception.GuitarStoreException;
import com.cts.gscp.model.Guitar;

public class GuitarServiceImpl implements GuitarService {
	
	private GuitarDAO guitarDAO;
	
	public GuitarDAO getDAO() {
		return guitarDAO;
	}
	public GuitarServiceImpl() throws GuitarStoreException{
		
//		guitarDAO=new GuitarDAOCollectionImpl();
		//guitarDAO=new GuitarDAOIOStreamImpl();
		guitarDAO=new GuitarDAOJDBCImpl();
	}
	
	public boolean isValidGuitarModel(String guitarModel) {
		
		
		
		
		
		Pattern guitarModelPattern=Pattern.compile("[G]\\d{4}");
		Matcher guitarModelMatcher=guitarModelPattern.matcher(guitarModel);
		
		return guitarModelMatcher.matches();
	}
	
	public boolean isValidGuitarName(String guitarName) {
		
		
		
		
		
		Pattern guitarNamePattern=Pattern.compile("[A-Z]\\w{2,24}");
		Matcher guitarNameMatcher=guitarNamePattern.matcher(guitarName);
		
		return guitarNameMatcher.matches();
	}
	
	public boolean isValidDateAdded(LocalDate dateAdded) {
		
		
		LocalDate today=LocalDate.now();
		return today.isAfter(dateAdded) || dateAdded.equals(today);
	}
	
	
	
	
	
	public boolean isValidPrice(double price) {
		
		return price>=1000 && price<=1000000;
	}
	
	public boolean isValidGuitar(Guitar guitar) throws GuitarStoreException {
		boolean isValid=false;
		List<String> err=new ArrayList<String>();
		
		if(!isValidGuitarModel(guitar.getGuitarModel()))
			err.add("Guitar Model should start with G followed by 4 digits");
		
		if(!isValidGuitarName(guitar.getGuitarName()))
			err.add("Guitar Name must start with capital and must be in between 3 to 25 chars in length");
		
		if(!isValidPrice(guitar.getPrice()))
			err.add("Price must be between INR.1000 and INR.1000000");
		
		if(!isValidDateAdded(guitar.getDateAdded()))
			err.add("Date Added should not be a future date");
		
		if(err.size()==0)
			isValid=true;
		else 
			throw new GuitarStoreException(err.toString());
		
		return isValid;
	}

	@Override
	public String add(Guitar guitar) throws GuitarStoreException {
		String guitarModel=null;
		if(guitar!=null && isValidGuitar(guitar)){
			guitarModel=guitarDAO.add(guitar);
		}
		return guitarModel;
	}

	@Override
	public boolean delete(String guitarModel) throws GuitarStoreException {
		boolean isDone=false;
		if(guitarModel!=null && isValidGuitarModel(guitarModel)){
			guitarDAO.delete(guitarModel);
			isDone = true;
		}else{
			throw new GuitarStoreException("Guitar Model should be a G followed by 4 digits");
		}
		return isDone;
	}

	@Override
	public Guitar get(String guitarModel) throws GuitarStoreException {
		return guitarDAO.get(guitarModel);
	}

	@Override
	public List<Guitar> getAll() throws GuitarStoreException {
		return guitarDAO.getAll();
	}

	@Override
	public boolean update(Guitar guitar) throws GuitarStoreException {
		boolean isDone = false;
		
		if(guitar!=null && isValidGuitar(guitar)){
			isDone = guitarDAO.update(guitar);
		}
		
		return isDone;
	}
	
	@Override
	public void persist() throws GuitarStoreException {
		guitarDAO.persist();
		
	}

}
