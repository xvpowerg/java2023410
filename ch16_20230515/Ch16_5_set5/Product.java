/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch16_20230515.Ch16_5_set5;

/**
 *
 * @author xvpow
 */
public class Product {
    private String name;
    private String location;
    private int price;
   
    public Product(String name, String location,int price){
        this.name = name;
        this.location = location;
        this.price = price;
    }
    
    public String getName(){
        return this.name;
    }
    public String getLocation(){
        return this.location;
    }
    public int getPrice(){
        return this.price;
    }
    
    
    public String toString(){
        return this.name+":"+this.location+":"+this.price;
    }
}
