/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.o7services.java;

/**
 *
 * @author o7solutions
 */
public class SquareShapeInterface implements ShapeInterface{
    
    public static void main(String q[]){
        SquareShapeInterface squareInterface = new SquareShapeInterface();
        squareInterface.getSide();
        
        
    }

    @Override
    public void draw() {
       }

    @Override
    public void getSide() {
        System.out.println("In get Value");
        }
    
}
