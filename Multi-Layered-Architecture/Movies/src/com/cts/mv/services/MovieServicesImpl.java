package com.cts.mv.services;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.cts.mv.dao.IMoviesDao;
import com.cts.mv.dao.MovieDaoCollectionsImpl;
import com.cts.mv.exception.MoviesException;
import com.cts.mv.model.Movies;

public class MovieServicesImpl implements IMoviesServices {

	private IMoviesDao movieDao;

	public IMoviesDao getDAO(){
		return movieDao;
	}
	
	public MovieServicesImpl() throws MoviesException{
		 movieDao = new MovieDaoCollectionsImpl();
		//movieDao = new MoviesDaoIOStreamImpl();
	}
	
	public boolean isValidId(String id){
		Pattern idPattern = Pattern.compile("[A-Z]{2}\\d{2}");
		Matcher idMatcher = idPattern.matcher(id);
		
		return idMatcher.matches();
	}
	
	public boolean isValidTitle(String title){
		Pattern titlePattern = Pattern.compile("[A-Z]\\w{3,25}");
		Matcher titleMatcher = titlePattern.matcher(title);
		
		return titleMatcher.matches();
	}
	
	public boolean isValidHero(String hero){
		Pattern heroPattern = Pattern.compile("[A-Z]\\w{3,15}");
		Matcher heroMatcher = heroPattern.matcher(hero);
		
		return heroMatcher.matches();
	}
	public boolean isValidCollections(double Collections){
		return Collections>=1000000.00 && Collections<=5000000000.00;
	}
	
	public boolean isValidReleaseDate(LocalDate releaseDate){
		LocalDate today = LocalDate.now();
		return today.isAfter(releaseDate) || releaseDate.equals(today);
	}
	
	public boolean isValidMovie(Movies movie) throws MoviesException{
		boolean isValid=false;
		
		List<String> errMsgs = new ArrayList<>();
		
		if(!isValidId(movie.getId()))
			errMsgs.add("Movie code should start with 2 alphabets followed by 2 digits");
		
		if(!isValidTitle(movie.getTitle()))
			errMsgs.add("Title must start with capital and must be in between 3 to 25 chars in length");
		
		if(!isValidHero(movie.getHero()))
			errMsgs.add("Hero name Should start with capital and must be in between 3 to 15 chars in length");
		
		if(!isValidCollections(movie.getCollections()))
			errMsgs.add("Price must be between INR.1000000 and INR.5000000000");
		
		if(!isValidReleaseDate(movie.getReleaseDate()))
			errMsgs.add("Release Date should not be a future date");
		
		if(errMsgs.size()==0)
			isValid=true;
		else
			throw new MoviesException(errMsgs.toString());
		
		return isValid;
	}
	
	
	@SuppressWarnings("unused")
	@Override
	public String add(Movies movie) throws MoviesException {
		String id=null;
		if(id!=null && isValidMovie(movie)){
			id=movieDao.add(movie);
		}
		return id;
		
	}

	@Override
	public boolean delete(String id) throws MoviesException {
			boolean isDone=false;
			if(id!=null && isValidId(id)){
				movieDao.delete(id);
				isDone = true;
			}else{
				throw new MoviesException("ID invalid,format AA00");
			}
			return isDone;
	}
	
	@Override
	public Movies get(String id) throws MoviesException {
		return movieDao.get(id);
	}

	@Override
	public List<Movies> getAll() throws MoviesException {
		return movieDao.getAll();
	}
	@Override
	public void persist() throws MoviesException {
		movieDao.persist();

	}


}
