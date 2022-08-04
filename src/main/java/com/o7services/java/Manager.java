/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.o7services.java;

/**
 *
 * @author o7solutions
 */
public class Manager extends Member{
    
    private String department;

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
    
    
    public static void main(String a[]){
        Manager manager = new Manager();
        Employee employee = new Employee();
        
        manager.setName("Vanshika");
        manager.setAddress("Kartarpur");
        manager.setPhoneNumber(1234567890);
        
        System.out.println("Manager info "+manager.getName()+" address "+manager.getAddress()+" phone number "+manager.getPhoneNumber());
        
    }
    
}
