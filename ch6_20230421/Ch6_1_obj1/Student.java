/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch6_20230421.Ch6_1_obj1;

/**
 *
 * @author xvpow
 */
public class Student {
    private String name;
    private int age;
    //建構式 沒有回傳值
    //名稱跟類別一樣
    //預設建構式
    Student(){}
    Student(String name,int age){
        this.name = name;
        this.age = age;
    }
    Student(String name){
        //this()呼叫建構式
        //this()只能用於建構式
        //this()只能是第一個命令
         this(name,0);
    }
    public void setName(String name){
        //this. 表示當前物件的
       this.name = name;
    }
    
    public String getName(){
        return name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }
    public void printInfo(){
        System.out.println(getName()+":"+getAge());
    }
}
