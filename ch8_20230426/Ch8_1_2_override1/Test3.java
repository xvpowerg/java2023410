/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch8_20230426.Ch8_1_2_override1;
import ch8_20230426.Ch8_1_override1.Test1;
/**
 *
 * @author xvpow
 */
public class Test3  extends Test1 {
    
    public void testPublic(){
        System.out.println("Test3 testPublic!");
    }
    
    public void testProtected(){
        System.out.println("Test3 testProtected!");
    }
    //不是Override 因為跨package
    void testDefault(){
         System.out.println("Test3 testDefault!");
    }
}
