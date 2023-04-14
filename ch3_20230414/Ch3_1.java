/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch3_20230414;
import java.util.Arrays;
/**
 *
 * @author xvpow
 */
public class Ch3_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int[] array1 = new int[5];
       array1[2] = 73;
       array1[4] = 51;
       
       for (int i = 0;i < array1.length;i++){       
           System.out.print(array1[i] +" ");
       }
         System.out.println();
        //foreach
       for (int v : array1){
           System.out.print(v+" ");
       } 
        System.out.println();
        
        Arrays.stream(array1).forEach(System.out::println);
    }
    
}
