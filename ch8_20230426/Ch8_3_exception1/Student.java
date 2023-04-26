/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch8_20230426.Ch8_3_exception1;

/**
 *
 * @author xvpow
 */
public class Student {
    private String name;
    private int age;
    
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    
    public void setAge(int age){
        if (age < 0 || age > 200){
           // System.out.println("錯誤的年齡");
            //return;
            throw new RuntimeException("錯誤的年齡");
        }
        this.age = age;
    }
    
    public int getAge(){
        return this.age ;
    }
    
    public void printInfo(){
        System.out.println(getName()+":"+getAge());
    }
}
