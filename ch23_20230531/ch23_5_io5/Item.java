/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch23_20230531.ch23_5_io5;
import java.io.Serializable;
/**
 *
 * @author xvpow
 */
public class Item implements Serializable {
    private String name;

    public Item(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Item{" + "name=" + name + '}';
    }
    
}
