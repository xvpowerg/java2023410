/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch1_20230410;

/**
 *
 * @author xvpow
 */
public class Ch1_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //and &&  短路現象 左邊是false就短路
       //or  || 短路現象 左邊是true就短路
       //not ! 反向
       
       System.out.println(true && true);
       System.out.println(true && false);
       System.out.println(true || false);
       System.out.println(false || false);
       System.out.println(!false);
       //短路測試
       int c = 0;
       boolean b1 = true && ++c > 0;
       System.out.println(c);
       c = 0;
      boolean b2 = false && ++c > 0; 
      System.out.println(c);
      
      c = 0;
      boolean b3 = false || ++c > 0;
      System.out.println(c);
      
      c = 0;
      boolean b4 = true || ++c > 0;
      System.out.println(c);
    }
    
}
