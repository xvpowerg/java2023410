/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch9_20230428.ch9_6_String;

/**
 *
 * @author xvpow
 */
public class Ch9_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        String msg = "qwer";
//        msg = msg.concat("123");
//        System.out.println(msg);
         
        // 單核心用StringBuilder
        //多核心用 StringBuffer
        StringBuilder sb = new StringBuilder();
        
        for (int i=1;i<=10;i++){
            sb.append(i+" ");
        }
        System.out.println(sb);
    }
    
}
