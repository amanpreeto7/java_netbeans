/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.o7services.java;

import java.util.Scanner;

/**
 *
 * @author o7solutions
 */
public class Square extends Shapes{
    
    int length;
    

    @Override
    void CalculateArea() {
        System.out.println("area is "+(length*length));
       }

    @Override
    void getLength() {
        Scanner scanner = new Scanner(System.in);
        length = scanner.nextInt();
       }

    @Override
    void getBreadth() {
       }

    @Override
    void getHeight() {
        }
    
    public static void main(String args[]){
    Square square = new Square();
    square.getLength();
    square.CalculateArea();
    
    }
    
}
