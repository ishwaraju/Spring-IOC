package beans;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionPool {
	private String driver,url,username,password;

	public void setDriver(String driver) {
		this.driver = driver;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	public void createConn(){
		System.out.println("Helllo");
		try {
			Class.forName(driver);
			Connection conn=DriverManager.getConnection(url,username,password);
			System.out.println(conn);
			System.out.println("inside try block");
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
}
