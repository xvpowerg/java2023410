/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch1_20230410;

/**
 *
 * @author xvpow
 */
public class Ch1_8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      String msg1 = "ABC";
      String msg2 = "ABc";
      //忽略大小寫比較
      System.out.println(msg1.equalsIgnoreCase(msg2));
      System.out.println(msg1.length());
      msg1 = null;//空值
      if (msg1 != null)
        System.out.println(msg1.equalsIgnoreCase(msg2));
   
      
      
    }
    
}
