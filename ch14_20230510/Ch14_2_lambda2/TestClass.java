/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch14_20230510.Ch14_2_lambda2;
import java.util.function.Consumer;
/**
 *
 * @author xvpow
 */
public class TestClass {
    private int count;
    TestClass(int count){
        this.count = count;
    }
    
    public void showString(String str){
        for (int i = 1; i <= count;i++){
            System.out.println(str+" ");
        }
    }
    public void runMethod(String v){
        Consumer<String> com = this::showString;
        com.accept(v);
    }
}
