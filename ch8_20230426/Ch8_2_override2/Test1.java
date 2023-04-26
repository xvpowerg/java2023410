/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch8_20230426.Ch8_2_override2;

/**
 *
 * @author xvpow
 */
public class Test1 {
    public int testMethod(){
        System.out.println("Test1 testMethod");
        return 20;
    }
    
    public Test1 testObjMethod(){
        System.out.println("Test1 testObjMethod");
        return new Test1();
    }
    
}
