/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.o7services.java;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author o7solutions
 */
public class TryCatch {
    
    public static void main(String a[]){
        
        try{
       // int ab = 100/0;
        Scanner scanner = new Scanner(System.in);
        int scannerVariable = scanner.nextInt();
            throw new IOException();
        
//        }catch(ArithmeticException exception){
//            System.out.print("in catch exception "+exception.getLocalizedMessage());
        }
        catch(IOException exception){
            System.out.print("in catch exception "+exception.getLocalizedMessage());
        }
         System.out.println("after exception");
        
        
    }
    
}
