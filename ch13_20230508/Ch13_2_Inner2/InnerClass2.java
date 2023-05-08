/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch13_20230508.Ch13_2_Inner2;

/**
 *
 * @author xvpow
 */
public class InnerClass2 {
   public static class StaticInner{
       //static inner 不可讀取外部非靜態的所有內容
       private String name;
       StaticInner(String name){
           this.name = name;
       }
       
       public String getName(){
           return this.name;
       }
   
   }
}
