/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch7_20230424.ch7_1_oo1;

/**
 *
 * @author xvpow
 */
public class Test1 {
    Test1(){
        this("Test1",20);
        System.out.println("Test1()");
    }
    
    Test1(String msg){
    System.out.println("Test1(String msg)");
    }
    
    Test1(String msg,int value){
    this(msg);
        System.out.println("Test1(String msg int value)");
    }
    //Test1(String msg)
    //Test1(String msg int value)
    //Test1()
}
