package com.cts.gscp.service;

import java.util.List;

import com.cts.gscp.exception.GuitarStoreException;
import com.cts.gscp.model.Guitar;

public interface GuitarService {
	String add(Guitar guitar) throws GuitarStoreException;
	boolean delete(String guitarModel) throws GuitarStoreException;
	Guitar get(String guitarModel) throws GuitarStoreException;
	List<Guitar> getAll() throws GuitarStoreException;
	boolean update(Guitar guitar) throws GuitarStoreException;
	void persist() throws GuitarStoreException;
}
