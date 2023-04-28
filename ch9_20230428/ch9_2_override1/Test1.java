/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch9_20230428.ch9_2_override1;

/**
 *
 * @author xvpow
 */
public class Test1 {
   public void testException()throws MainException{
       throw new MainException();
   }
   
   public void testRuntimeEx()throws MainRuntimeEx{
       throw new MainRuntimeEx();
   }
}
