/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch13_20230508.Ch13_8_lambda4;
import java.util.function.BiFunction;
/**
 *
 * @author xvpow
 */
public class Ch13_8 {

    static void testBiFunction(int v1,String v2,BiFunction<Integer,String,String> func){
        
        String result = func.apply(v1, v2);
        System.out.println(result);
    }
    public static void main(String[] args) {
       
       testBiFunction(2,"ABCDE",(Integer v1,String v2)->{        
            return v2.substring(v1);
        });
       
        testBiFunction(3,"A",(v1,v2)->{
            String result = "";
            for (int i = 1; i <= 3;i++){
                result+="A";
            }
            return result;
        });
        
        
        
    }
    
}
