package com.cts.gscp.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectionProvider {
	
	private static ConnectionProvider instance;
	private String dbUrl;
	private String dbName;
	private String password;
	
	public final static String JDBC_PROPER_FINAL="./res/jdbc.properties";

	private ConnectionProvider() throws FileNotFoundException, IOException {
		Properties jdb=new Properties();
		jdb.load(new FileInputStream(JDBC_PROPER_FINAL));
		
		dbUrl=jdb.getProperty("db.url");
		dbName=jdb.getProperty("db.unm");
		password=jdb.getProperty("db.pwd");
	}
	
	public Connection getConnection() throws SQLException {
		return DriverManager.getConnection(dbUrl,dbName,password);
	}
	
	public static ConnectionProvider getInstance() throws FileNotFoundException, IOException {
		if(instance==null) {
			instance=new ConnectionProvider();
		}
		return instance;
	}
	
}
