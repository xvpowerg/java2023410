/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch10_20230501.Ch10_7_abs2;

/**
 *
 * @author xvpow
 */
public  abstract class Employee {
    private String name;
    private int salary;
    Employee(String name,int salary){
        this.name = name;
        this.salary = salary;
    }
    
    public abstract int getPay();
    
    public int getSalary(){
        return salary + getPay();
    }
    public String getName(){
        return name;
    }
    
    public String toString(){
        return this.getName()+":"+this.getSalary();
    }
}
