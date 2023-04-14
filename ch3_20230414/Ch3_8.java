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
public class Ch3_8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] array1 = new int[500];
        Arrays.fill(array1, 100);
        System.out.println(array1[5]);
       
        int[] array2 = {5,7,9,11,25,31};
        int[] array3 = Arrays.copyOf(array2, array2.length);
        for (int v :array3){
            System.out.print(v+" ");
        }
         System.out.println();
    }
    
}
