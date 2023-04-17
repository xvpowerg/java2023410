/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch4_20230417;

/**
 *
 * @author xvpow
 */
public class Ch4_3 {

    /**
     * @param args the command line arguments
     */
    //遞迴必須有終止條件 
    //遞迴會有次數限制
    
    static void test1(int i){
         System.out.println("p:"+i);
        if (i < 5){
          test1(i + 1);  
        }
        System.out.println("e:"+i);
    }
    public static void main(String[] args) {
        // TODO code application logic here
       test1(1);
       System.out.println("main:");
//      for (int i =1 ;i <= 1000000000;i++){
//          
//      }
    }
    
}
