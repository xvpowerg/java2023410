/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch10_20230501.Ch10_6_abs1;

/**
 *
 * @author xvpow
 */
public class Dog  extends Animal {
    Dog(String name,int age){
     super(name,age);   
    }
    
    public String toString(){
        return "Dog:"+super.toString();
    }
}
