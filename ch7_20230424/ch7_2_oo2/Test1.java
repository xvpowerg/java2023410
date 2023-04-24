/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch7_20230424.ch7_2_oo2;

/**
 *
 * @author xvpow
 */
public class Test1 {
   Test1(){
       this("msg",20);
       System.out.println("Test1()");
   }
   
   Test1(String  m ,int v){
       this(m);
       System.out.println(" Test1(String  m ,int v)");
   }
   
   Test1(String m){
       System.out.println("Test1(String m)");
       
   }
}
