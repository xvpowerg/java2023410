/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch14_20230510.Ch14_2_lambda2;
import java.util.function.Consumer;
/**
 *
 * @author xvpow
 */
public class Ch14_2 {

   
    public static void main(String[] args) {
        TestClass tc = new TestClass(3);
        tc.runMethod("A");
        Consumer<String> c2 = tc::showString;
        System.out.println("==========================");
        c2.accept("B");
    }
    
}
