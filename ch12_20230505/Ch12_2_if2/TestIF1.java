/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ch12_20230505.Ch12_2_if2;

/**
 *
 * @author xvpow
 */
public interface TestIF1 {
   void run();
   default void testDefault(){
       System.out.println("TestIF1 testDefault");
   }
}
