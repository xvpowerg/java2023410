/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch10_20230501.Ch10_3_init3;

/**
 *
 * @author xvpow
 */
public class TestInitOrder {
    TestInitOrder(){
        System.out.println("TestInitOrder()");
    }
    
    public static void testStatic(){
        System.out.println("testStatic!");
    }
    
    {
       System.out.println("Init Black 1");
    }
    
    static{
       System.out.println("Static Init Black 1");
    }
    {
         System.out.println("Init Black 2");
    }
    static{
          System.out.println("Static Init Black 2");
    }
}
