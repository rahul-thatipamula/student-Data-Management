/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.studentbiodata;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Rahul
 */
public class EmailVerifier {
   
    private String email;

    // Constructor with one argument to take input email
    public EmailVerifier(String email) {
        this.email = email;
    }

    // Method to verify if the email is correctly formatted
    public boolean verifyEmail() {
        // Regular expression for email pattern
        String emailPattern = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
        Pattern pattern = Pattern.compile(emailPattern);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

    
}

    
