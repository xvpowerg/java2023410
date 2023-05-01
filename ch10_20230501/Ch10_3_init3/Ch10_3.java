/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch10_20230501.Ch10_3_init3;

/**
 *
 * @author xvpow
 */
public class Ch10_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         //TestInitOrder t = null;
         //TestInitOrder.testStatic();
         //Static Init Black  只會呼叫一次
         //Init Black new幾次呼叫幾次
         TestInitOrder t2 = new TestInitOrder();
          TestInitOrder t3 = new TestInitOrder();
         
    }
    
}
