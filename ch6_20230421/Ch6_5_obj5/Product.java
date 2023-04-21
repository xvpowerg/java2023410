/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch6_20230421.Ch6_5_obj5;

/**
 *
 * @author xvpow
 */
public class Product {
    private String name;
    private int price;
    
    Product(){}
    Product(String name,int price){
        this.name = name;
        this.price = price;
    }
    
    public String getName(){
        return this.name;
    }
    public int getPrice(){
        return this.price;
    }
    
    public void printInfo(){
        System.out.println(this.getName()+":"+this.getPrice());
    }
}
