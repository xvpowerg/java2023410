/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch7_20230424.ch7_6_override4;

/**
 *
 * @author xvpow
 */
public class TestPrivate {
    private TestPrivate(){
        System.out.println("TestPrivate");
    }
    public static TestPrivate create(){
        return new TestPrivate();
    }
}
