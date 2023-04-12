/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch2_20230412;

/**
 *
 * @author xvpow
 */
public class Ch2_1 {

   
    public static void main(String[] args) {
       int age = 25;
       //if else 內只有一行命令可不加{}
       if (age >= 18)
           System.out.println("成年");
       else
           System.out.println("未成年");
           System.out.println("Test!!");
       
      int score = 51;

      String msg = score >= 60 ? "及格":"不及格";
      System.out.println(msg);
           
    }
    
}
