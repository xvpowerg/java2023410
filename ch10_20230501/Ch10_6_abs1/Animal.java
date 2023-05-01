/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch10_20230501.Ch10_6_abs1;

/**
 *
 * @author xvpow
 */
public abstract class Animal {
    private String name;
    private int age;
    
    Animal(String name,int age){
        this.setName(name);
        this.setAge(age);        
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }
    
    public String toString(){
        return name+":"+age;
    }
}
