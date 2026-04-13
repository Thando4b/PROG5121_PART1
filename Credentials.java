/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license 
 */
package com.mycompany.prog5121_poe_part1;

/**
 *
 * @author Thando
 */
public class Credentials {
 private String storeFirstname;
   private String storeLastname;
  private String storeUsername;
    private String storePassword;
    private String storeCellNumber;
 
  // 1. Check Username
    public boolean checkUserName(String username) {
        return username.contains("_") && username.length() <= 5;
    }

    // 2. Check Password Complexity
    public boolean checkPasswordComplexity(String password) {
        boolean hasUpper = false;
        boolean hasNumber = false;
        boolean hasSpecial = false;  

        if (password.length() < 8) {
            return false;
        }

        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c)) {
                hasUpper = true;
            } else if (Character.isDigit(c)) {
                hasNumber = true;
            } else if (!Character.isLetterOrDigit(c)) {
                hasSpecial = true;
            } else{
           
            }
        }

        return hasUpper && hasNumber && hasSpecial;
    }

    // 3. Check Cell Phone Number (South Africa format)
    public boolean checkCellPhoneNumber(String number) {
        return number.startsWith("+27") && number.length() == 12;
    }

    // 4. Register User
    public String registerUser(String username,String password,String cellNumber,String firstname,String lastname) {

        if (!checkUserName(username)) {
            return "Username is not correctly formatted; please ensure that your username contains an underscore and is no more than five characters in length.";
         
        }

        if (!checkPasswordComplexity(password)) {
            return "Password is not correctly formatted; please ensure that the password contains at least eight characters, a capital letter, a number, and a special character.";
        }

        if (!checkCellPhoneNumber(cellNumber)) {
            return "Cell phone number is incorrectly formatted; please ensure it starts with +27 and is 12 digits long.";
        }

        // Store details
        
        storeUsername = username;
        storePassword = password;
        storeCellNumber = cellNumber;
        storeFirstname = firstname;
        storeLastname = lastname;

        return "User has been registered successfully.";
        
    }

    // 5. Login User
    public boolean loginUser(String username,String password) {
        return username.equals(storeUsername) && password.equals(storePassword);
    }

    public String returnLoginStatus(boolean loginSuccess) {
        if (loginSuccess) {
            return "Login successful.\n Welcome " + storeFirstname + " "+ storeLastname + " it is great to see you.";
        } else {
            return "Login failed. Username or password incorrect.";
        }
    }
}
    

    
