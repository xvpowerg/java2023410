/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch12_20230505.Ch12_7_if7;
import java.util.function.Function;
/**
 *
 * @author xvpow
 */
public class Ch12_7 {

      static int stringToInt(String str,Function<String,Integer> func){
          return func.apply(str);
      }
    public static void main(String[] args) {
        StringToIntLen  len = new StringToIntLen();
        int strLen  = stringToInt("12673",len);
        System.out.println(strLen);
        StringToParseInt stp = new StringToParseInt();
       int number =  stringToInt("12673",stp);
       System.out.println(number);  
       
       
    }
    
}
