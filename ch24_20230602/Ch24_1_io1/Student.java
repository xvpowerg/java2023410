/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch24_20230602.Ch24_1_io1;
import java.io.Serializable;
public class Student implements Serializable{
    private  String name;
    
    private transient Book book1;

    public Student(String name, Book book1) {
        this.name = name;
        this.book1 = book1;
    }
    
    @Override
    public String toString() {
        return "Student{" + "name=" + name + ", book1=" + book1 + '}';
    }
    
    
}
