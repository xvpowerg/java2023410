/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch13_20230508.Ch13_9_lambda5;
import java.util.function.Function;
/**
 *
 * @author xvpow
 */
public class Ch13_9 {

    static void map(String msg,Function<String,Integer> func){
        System.out.println(func.apply(msg));
    }
    public static void main(String[] args) {
        // TODO code application logic here
        map("ABCDE",v1->v1.length());
    }
    
}
