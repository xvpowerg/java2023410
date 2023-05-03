/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ch11_20230503.Ch11_7_if5;

/**
 *
 * @author xvpow
 */
public interface Action {
       void run();
       //default 方法用來呼叫抽象方法
       default void testRun()    {
           run();
       }
}
