/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch14_20230510.Ch14_3_lambda3;
import java.util.function.Function;
/**
 *
 * @author xvpow
 */
public class Ch14_3 {
    public static void main(String[] args) {        
        Function<String,Integer> func1 = String::length;
        System.out.println(func1.apply("ABCD"));
        
        Function<String,TestObject> func2 = TestObject::new;
        System.out.println(func2.apply("Lucy"));
    }
    
}
