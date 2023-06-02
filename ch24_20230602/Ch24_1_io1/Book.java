/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch24_20230602.Ch24_1_io1;
import java.io.Serializable;
/**
 *
 * @author xvpow
 */
public class Book implements Serializable {
    private String name;
    private int isbn;

    public Book(String name, int isbn) {
        this.name = name;
        this.isbn = isbn;
    }

    public String getName() {
        return name;
    }

    public int getIsbn() {
        return isbn;
    }

    @Override
    public String toString() {
        return "Book{" + "name=" + name + ", isbn=" + isbn + '}';
    }
    
}
