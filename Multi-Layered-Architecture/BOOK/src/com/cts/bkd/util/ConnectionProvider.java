package com.cts.bkd.util;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectionProvider {

	private static ConnectionProvider instance;
	private String url;
	private String userName;
	private String password;
	
	public static final String JDBC_PROPS_NAME = "./res/jdbc.properties";
	
	private ConnectionProvider() throws FileNotFoundException, IOException {
		Properties jdb = new Properties();
		jdb.load(new FileInputStream(JDBC_PROPS_NAME));
	
		url = jdb.getProperty("db.url");
		userName = jdb.getProperty("db.unm");
		password = jdb.getProperty("db.pwd");
	}
	
	public Connection getConnection() throws SQLException{
		return DriverManager.getConnection(url,userName,password);
	}
	
	public static ConnectionProvider getInstance() throws FileNotFoundException, IOException{
		if(instance==null)
			instance=new ConnectionProvider();
		return instance;
	}
}
