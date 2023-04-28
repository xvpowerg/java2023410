/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch9_20230428.ch9_4_static1;

/**
 *
 * @author xvpow
 */
public class Employee {
    private String name;
    private int salary;
    //static 屬於類別 記憶體資源共享
    private static String company;
    public Employee(String name,int salary){
        this.name = name;
        this.salary = salary;                
    }
    
    public static void  setCompany(String company){
        Employee.company = company;
    }
    
    public void setSalary(int salary){
        this.salary = salary;
    }
    
    public String toString(){
        return this.name +":"+this.salary+":"+company;
    }
}
