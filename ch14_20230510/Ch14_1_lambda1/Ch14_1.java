/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch14_20230510.Ch14_1_lambda1;
import java.util.function.Function;
/**
 *
 * @author xvpow
 */
public class Ch14_1 {

    static String intToString(Integer count){
         String result = "";
        char base = 'A';
            for(int i = 0; i <count;i++){
                result += (char)(base+ i % 26);
            }        
        return result;
    }
    
    public static void main(String[] args) {
      
       Function<Integer,String> fun = v->{
        String result = "";
        char base = 'A';
            for(int i = 0; i <v;i++){
                result += (char)(base+ i % 26);
            }        
        return result;
       }; 
        System.out.println(fun.apply(32));
           Function<Integer,String> fun2 = Ch14_1::intToString;
           System.out.println(fun2.apply(18));
    }
    
}
