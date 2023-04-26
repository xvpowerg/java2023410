/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch8_20230426.Ch8_4_exception2;

/**
 *
 * @author xvpow
 */
public class TestException {
    public void test1(boolean b1)throws Exception{
        if (b1){
            throw new Exception();
        }
    }
    
    public void test2(boolean b2)throws RuntimeException{
        if (b2){
            throw new RuntimeException();
        }
    }
}
