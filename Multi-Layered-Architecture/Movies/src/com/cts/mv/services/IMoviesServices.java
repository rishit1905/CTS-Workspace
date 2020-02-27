package com.cts.mv.services;

import java.util.List;

import com.cts.mv.exception.MoviesException;
import com.cts.mv.model.Movies;

public interface IMoviesServices {
	String add(Movies movie) throws MoviesException;
	boolean delete(String id) throws MoviesException;
	Movies get(String id) throws MoviesException;
	List<Movies> getAll() throws MoviesException;
	void persist()throws MoviesException;

}
