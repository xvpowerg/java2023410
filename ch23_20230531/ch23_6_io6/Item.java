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
public class Item extends Product implements Serializable {
    private String name;

    public Item(String name,int price) {
        super(price);
        this.name = name;
    }

    @Override
    public String toString() {
        return "Item{" + "name=" + name+" price:"+super.toString()+"}" ;
    }
    
}
