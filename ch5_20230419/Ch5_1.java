/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch5_20230419;

/**
 *
 * @author xvpow
 */
public class Ch5_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Boolean b1 = true;
        boolean b2 = b1;
        System.out.println(!b2);
        
        boolean b3 = Boolean.parseBoolean("true");
        System.out.println(b3);
        
        //只要true不分大小寫
        boolean b4 = Boolean.parseBoolean("tRue");
        System.out.println(b4);
         //只要不是true不分大小寫 就回傳false
        boolean b5 = Boolean.parseBoolean("AAAAA");
       System.out.println(b5);
    }
    
}
