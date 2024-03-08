/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.studentbiodata;

/**
 *
 * @author Rahul
 */
import java.sql.*;
import java.util.Properties;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
public class GetConnection {

	public static Connection createConnection() {
		Connection connection= null;
		try {
		Properties properties = new Properties();
		properties.load(new FileInputStream("d:/oracle.properties"));
		connection = DriverManager.getConnection(properties.getProperty("url"),properties.getProperty("username"),properties.getProperty("password"));
		
		}
	catch(SQLException e) {
		System.out.println(e.getMessage()+" exception here");
	}
              catch(FileNotFoundException fnfe){
                  System.out.print(fnfe.getMessage());
              }
                catch(IOException io){
                    System.out.println(io.getMessage());
                }
	
		return connection;
		
	}
}

