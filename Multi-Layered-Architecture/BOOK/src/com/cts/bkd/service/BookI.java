package com.cts.bkd.service;

import java.util.List;

import com.cts.bkd.exception.BookException;
import com.cts.bkd.model.Book;

public interface BookI {
	String add(Book book) throws BookException;
	boolean delete(String bcode) throws BookException;
	Book get(String bcode) throws BookException;
	List<Book> getAll() throws BookException;;
	boolean update(Book book) throws BookException;
	void persist()throws BookException;
}
