/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch9_20230428.ch9_3_override2;

/**
 *
 * @author xvpow
 */
public class Student {
    private String name;
    private int age;
    Student(String name,int age){
        this.age = age;
        this.name = name;
    }
    
    
    public String toString(){
        return this.name+":"+this.age;
    }
    
    public boolean equals(Object obj){
        // obj instanceof Student 回傳true表示obj是Student
        if (obj == null ||  obj instanceof Student == false){
            return false;
        }
            
        
        Student tmp = (Student)obj;
        return this.age == tmp.age &&
                this.name.equals(tmp.name);
    }
}
