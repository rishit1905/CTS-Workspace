package com.cts.gscp.dao;

import com.cts.gscp.model.Guitar;
import com.cts.gscp.exception.GuitarStoreException;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class GuitarDAOIOStreamImpl implements GuitarDAO {
	public static final String DATA_STORE_FILE_NAME = "guitarstore.dat";

	private Map<String, Guitar> guitars;

	public GuitarDAOIOStreamImpl() throws GuitarStoreException {
		File file = new File(DATA_STORE_FILE_NAME);

		if (!file.exists()) {
			guitars = new TreeMap<>();
		} else {
			try (ObjectInputStream fin = new ObjectInputStream(
					new FileInputStream(DATA_STORE_FILE_NAME))) {

				Object obj = fin.readObject();

				if (obj instanceof Map) {
					guitars = (Map<String, Guitar>) obj;
				} else {
					throw new GuitarStoreException("Not a valid DataStore");
				}
			} catch (IOException | ClassNotFoundException exp) {
				throw new GuitarStoreException("Loading Data Failed");
			}
		}
	}

	@Override
	public String add(Guitar guitar) throws GuitarStoreException {
		String guitarModel = null;
		if (guitar!= null) {
			guitarModel= guitar.getGuitarModel();
			guitars.put(guitarModel, guitar);
		}
		return guitarModel;
	}

	@Override
	public boolean delete(String bcode) throws GuitarStoreException {
		boolean isDone = false;
		if (bcode != null) {
			guitars.remove(bcode);
			isDone = true;
		}
		return isDone;
	}

	@Override
	public Guitar get(String guitarModel) throws GuitarStoreException {
		return guitars.get(guitarModel);
	}

	@Override
	public List<Guitar> getAll() throws GuitarStoreException {
		return new ArrayList<Guitar>(guitars.values());
	}

	@Override
	public boolean update(Guitar guitar) throws GuitarStoreException {
		boolean isDone = false;
		if (guitar != null) {
			String guitarModel = guitar.getGuitarModel();
			guitars.replace(guitarModel, guitar);
		}
		return isDone;
	}

	
	public void persist() throws GuitarStoreException {
		try (ObjectOutputStream fout = new ObjectOutputStream(
				new FileOutputStream(DATA_STORE_FILE_NAME))) {
			fout.writeObject(guitars);
		} catch (IOException exp) {
			throw new GuitarStoreException("Saving Data Failed");
		}
	}
}