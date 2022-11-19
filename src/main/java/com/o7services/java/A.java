/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.o7services.java;

/**
 *
 * @author o7solutions
 */
public class A {
    public int a;
    public void display(){
    System.out.println("value of a + 10");
    }
   public static void main(String a[]){
    try{
        int age = 10;
        if(age>10)
        throw new MyException();
        else{
        throw new MyException();
        }

    }catch(MyException myexception){
            System.out.println("my exception "+myexception);
           if(myexception.getMessage() == "true"){
               System.out.println("you can drive");
           }else{
                              System.out.println("you cannot drive");

           }
    System.out.println("my exception with get message: "+myexception.getMessage());
    }
   }
    
    
 
    

}
    

