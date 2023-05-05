/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch12_20230505.Ch12_5_if5;
import java.util.function.Consumer;
/**
 *
 * @author xvpow
 */
public class PrintStyle implements  Consumer<String>{
    public void accept(String str){
        System.out.println(str+"--");
    }
}
