/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prog5121_poe_part1;
import java.util.Scanner;

/**
 *
 * @author Thando
 */
public class PROG5121_POE_PART1 {

    public static void main(String[] args) {
 Register();
}



public static void Register(){
       Scanner input = new Scanner(System.in);
        Credentials system = new Credentials();
      // Registration
        System.out.println("=== Register ===");
        
        System.out.print("Enter Firstname: ");
        String firstname = input.nextLine();
        
        System.out.print("Enter Lastname: ");
        String lastname = input.nextLine();
        
        System.out.print("Enter username: ");
        String username = input.nextLine();

        System.out.print("Enter password: ");
        String password = input.nextLine();

        System.out.print("Enter cell number (+27...): ");
        String cell = input.nextLine();

        String registrationMessage = system.registerUser(username, password, cell, firstname, lastname);
        System.out.println(registrationMessage);
        if(registrationMessage =="User has been registered successfully."){
             Login();
         }else{
             Register();
         } 
       
        
   }
   public static void Login(){
       Scanner input = new Scanner(System.in);
        Credentials system = new Credentials();
         // Login
        System.out.println("\n=== Login ===");
        System.out.print("Enter username: ");
        String loginUser = input.nextLine();

        System.out.print("\n Enter password: ");
        String loginPass = input.nextLine();

        boolean loginResult = system.loginUser(loginUser, loginPass);
        System.out.println(system.returnLoginStatus(loginResult));

        input.close();
   }

    
}
