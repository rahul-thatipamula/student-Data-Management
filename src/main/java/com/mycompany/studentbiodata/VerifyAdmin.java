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
   
    
    
}
