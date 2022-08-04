/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.o7services.java;

/**
 *
 * @author o7solutions
 */
public class Child extends Parent{
    void printChild(){
    System.out.println("This is child");
    }
    
    public static void main(String a[]){
    Child child = new Child();
    child.printChild();
    child.Print();
 
    Parent parent = new Parent();
    parent.Print();
    }
    
}
