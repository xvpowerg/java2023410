/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tw.com.m9;
import tw.com.m8.TestM8;
import tw.com.m6.TestM6;
import tw.com.m7.TestM7;

/**
 *
 * @author xvpow
 */
public class TestM9 {

    
    public static void main(String[] args){
        TestM8 m8 = new TestM8();
        TestM6 tm6 = new TestM6();
        TestM7 tm7 = new TestM7();
        m8.showTestM6(tm6);
        m8.showTestM7(tm7);
    }
}
