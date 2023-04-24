/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch7_20230424.ch7_6_override4;

/**
 *
 * @author xvpow
 */
public class Ch7_6 {
     public static void main(String[] args) {
            TestPublic obj1 = new TestPublic();
            TestProtected obj2 = new TestProtected();
            TestDefault obj3 = new TestDefault();
            //TestPrivate obj4 = new TestPrivate();
            TestPrivate obj4 = TestPrivate.create();
     }
}
