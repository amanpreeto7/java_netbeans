/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.o7services.java;

/**
 *
 * @author o7solutions
 */
public class Bike extends Vehicle{

    @Override
    void information() {
       System.out.println("in the abstract method");
    }
    
    public static void main(String a[]){
        Bike bike = new Bike();
        bike.information();
    }
    
}
