/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch23_20230531.ch23_6_io6;
import java.io.Serializable;

/**
 *
 * @author xvpow
 */
public class Product{
    private int price;
    public Product(){
        
    }
    public Product(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return  price+"";
    }
    
    
}
