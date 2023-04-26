/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch8_20230426.Ch8_1_override1;

/**
 *
 * @author xvpow
 */
public class Test2 extends Test1 {
    /*
    public 
    protected
    default
    private
    */
    //只能用public
     @Override
    public void testPublic(){
        System.out.println("Test2 testPublic");
    }
     @Override
    //能用protected 與 public
    protected void testProtected(){
         System.out.println("Test2 testProtected");
    } 
    @Override
     //能用default,protected 與 public 
     void testDefault(){
         System.out.println("Test2 testDefault");
    }
    
     private  void testPrivate(){
        System.out.println("Test2 testPrivate"); 
     }
}
