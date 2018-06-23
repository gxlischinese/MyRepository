package com.lovo.ioc.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBBean {
	public DBBean(){};
	private String userName;
	private String password;
	private String driver;
	private String url;

	public DBBean(String userName, String password, String driver, String url) {
		super();
		this.userName = userName;
		this.password = password;
		this.driver = driver;
		this.url = url;
	}
	
	public Connection getConnection() throws ClassNotFoundException, SQLException{
		Connection conn=null;
		//¼ÓÔØÇý¶¯
		Class.forName(driver);
		conn=DriverManager.getConnection(url, userName, password);
		return conn;
	}
	
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getDriver() {
		return driver;
	}
	public void setDriver(String driver) {
		this.driver = driver;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	
	
}
