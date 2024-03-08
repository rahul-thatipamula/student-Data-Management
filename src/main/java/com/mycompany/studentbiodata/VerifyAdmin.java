/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.studentbiodata;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Rahul
 */
public class VerifyAdmin {
    private String userName;
    private String password;
    VerifyAdmin(String userName,String password){
        this.userName = userName;
        this.password = password;
       
    }
    public boolean verifyDetails(){
        
                 Connection con;
		 PreparedStatement preparedStatement;
		try {
	
		con = GetConnection.createConnection();
		String command = "select * from admindetails where email =? and password = ? ";
                preparedStatement= con.prepareStatement(command);
                preparedStatement.setString(1, userName);
                preparedStatement.setString(2, password);
               ResultSet s = preparedStatement.executeQuery();
                
                if(s.next()){
                    return true; 
                }
                else {
                    return false;
                }
                
                }
                catch(SQLException e){
                    e.printStackTrace();   
                }
                return false;
    }
    
    
}
