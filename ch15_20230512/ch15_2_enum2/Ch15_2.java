/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch15_20230512.ch15_2_enum2;

/**
 *
 * @author xvpow
 */
public class Ch15_2 {
    
    enum Fruit{
        APPLE,BANANA,KEWI
    }
    
    
    public static void main(String[] args) {     
        System.out.println(Fruit.APPLE.getClass());
       Fruit b =  Fruit.valueOf("BANANA");
       System.out.println(b);
       Fruit[] fs =   Fruit.values();
       for (Fruit f : fs){
           System.out.println(f);
       }
       
       System.out.println(Fruit.APPLE.name());
         System.out.println(Fruit.KEWI.ordinal());
    }
    
}
