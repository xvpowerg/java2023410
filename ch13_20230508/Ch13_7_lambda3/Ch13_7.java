/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch13_20230508.Ch13_7_lambda3;

/**
 *
 * @author xvpow
 */
public class Ch13_7 {

    static int runTestFunc3(String v1,TestFunc3 func3){
        
        return func3.func(v1);
    }
    public static void main(String[] args) {
   int len =   runTestFunc3("ABCDE",(String myV1)->{
       return myV1.length();
     });   
   System.out.println(len);
   
   int number1 = 
           runTestFunc3("12345",(myV1)->Integer.parseInt(myV1));
   System.out.println(number1);
    }
    
}
