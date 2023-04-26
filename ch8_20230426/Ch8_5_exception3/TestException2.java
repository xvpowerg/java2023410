/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch8_20230426.Ch8_5_exception3;
import java.io.IOException;
import java.sql.SQLException;
        
/**
 *
 * @author xvpow
 */
public class TestException2 {
    public void test1(boolean b1,boolean b2)throws IOException,SQLException{
        if (b1){
            throw new IOException();
        }else if(b2){
            throw new SQLException();
        }
    }
    
    public void test2(boolean b1,boolean b2){
        if (b1){
            throw new IllegalArgumentException();
        }else if(b2){
            throw new NullPointerException();
        }
        
    }
}
