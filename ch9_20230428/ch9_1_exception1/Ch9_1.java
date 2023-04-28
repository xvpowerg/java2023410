/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch9_20230428.ch9_1_exception1;

/**
 *
 * @author xvpow
 */
public class Ch9_1 {

    static void runTest1Exception()throws Test1Exception{
        throw new Test1Exception("My Test1Exception");
    }
    
    static void runRuntimeException(){
        throw new Test2RuntimeException("runRuntimeException");
    }
    public static void main(String[] args) {
        //Exception1 | Exception2
        //Exception1 與 Exception2  不能有繼承關係
        try{
            runTest1Exception();
            runRuntimeException();
        }catch(Test1Exception | Test2RuntimeException ex){
            System.out.println(ex);//My Test1Exception
        }
        
        
        
    }
    
}
