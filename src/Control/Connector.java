/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control;


import java.sql.*;
import java.sql.DriverManager;

/**
 *
 * @author usama
 */
public class Connector {
    private static final String DB_DRIVER = 
		           "com.mysql.jdbc.Driver";
	private static final String DB_URL = 
		        "jdbc:mysql://localhost:3306/";
	private static final String DB_USERNAME = "root";
	private static final String DB_PASSWORD = "Tanaman123%";

    public Connection Connect() {
        Connection conn = null;
		try{
			//Register the JDBC driver
			Class.forName(DB_DRIVER);
 
			//Open the connection
			conn = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
 
			if(conn != null){
			   System.out.println("Successfully connected.");
			}else{
			   System.out.println("Failed to connect.");
			}
		}catch(Exception e){
			e.printStackTrace();
		}
        return conn;
    }     
    
}
