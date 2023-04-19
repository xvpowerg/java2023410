/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch5_20230419.Ch5_6_object3;

/**
 *
 * @author xvpow
 */
public class Person {
    private String name;
    private int age;
    float height;
    
    public void setName(String inName){
        if (inName == null || inName.length() <2 || inName.length() > 30){
            System.out.println("錯誤的name");
            return;
        }
        name = inName;
    }
    public String getName(){
        return name;
    }
    
    //寫入
    public void setAge(int inAge){
        if (inAge < 0 || inAge > 300){
            System.out.println("錯誤的年齡");
            return;//離開函數
        }
        age = inAge;
    }
    //讀取
    public int  getAge(){
        return age;
    }
    void printInfo(){
        System.out.println(getName()+":"+getAge()+":"+height);
    }
            
}
