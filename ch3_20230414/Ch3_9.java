/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch3_20230414;

/**
 *
 * @author xvpow
 */
public class Ch3_9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String msg = "ABCDEF";
        System.out.println(msg.length());
        byte[] byeArray = msg.getBytes();
        for (byte b : byeArray){
            System.out.print(b+" ");
        }
        System.out.println();
       System.out.println(msg.charAt(2));
       System.out.println(msg.charAt(4));
          System.out.println();
       for (int i = 0; i < msg.length();i++){
           System.out.println(msg.charAt(i));
       }
    }
    
}
