/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch8_20230426.Ch8_2_override2;

/**
 *
 * @author xvpow
 */
public class Test2  extends Test1 {
    
    public int testMethod(){
        System.out.println("Test2 testMethod");
        return 15;
    }
    //回傳值可以是子類型
    public Test2 testObjMethod(){
        System.out.println("Test2 testObjMethod");
        return new Test2();
    }
}
