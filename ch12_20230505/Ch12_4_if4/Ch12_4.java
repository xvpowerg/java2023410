/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch12_20230505.Ch12_4_if4;

/**
 *
 * @author xvpow
 */
public class Ch12_4 {

    
    static void testRun(FunctionIF fun){
        fun.run();
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        MyRun myRun = new MyRun();        
        testRun(myRun);
      
    }
    
}
