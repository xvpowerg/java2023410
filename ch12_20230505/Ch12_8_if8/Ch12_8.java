/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch12_20230505.Ch12_8_if8;
import java.util.function.UnaryOperator;
/**
 *
 * @author xvpow
 */
public class Ch12_8 {
     static void increment(int[] array,UnaryOperator<Integer> uop){
         for (int i = 0; i < array.length;i++){
             array[i] = uop.apply(array[i]);
         }
     }
    public static void main(String[] args) {
        // TODO code application logic here
        Increment incr5 = new Increment();
        int[] array = {1,2,3,4};
        increment(array,incr5);
        for (int v : array){
            System.out.println(v);
        }
        System.out.println("===============================");
       Increment incr3 = new Increment(2);
       increment(array,incr3);
       
            for (int v : array){
            System.out.println(v);
        }
       
    }
    
}
