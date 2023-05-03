/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch11_20230503.Ch11_8_if6;

/**
 *
 * @author xvpow
 */
public class Fruit {
    private String name;
    private int price;
    
    Fruit(String name,int price){
        this.name = name;
        this.price = price;
    }
    public String getName(){
        return name;
    }
    
    public int getPrice(){
        return this.price;
    }
    
    public String toString(){
        return this.getName()+":"+
                this.getPrice();
    }
}
