/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch6_20230421.Ch6_2_obj2;

/**
 *
 * @author xvpow
 */
public class Animal {
    private String name;
    private float height;
    Animal(){}
    Animal(String name,float height){
        this.name = name;
        this.height = height;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setHeight(float height){
        this.height = height;
    }
    public String getName(){
        return this.name;
    }
    public float getHeight(){
        return this.height;
    }
    public void printInfo(){
        System.out.println(this.getName()+":"+this.getHeight());
    }
}
