/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch9_20230428.ch9_5_init1;
import java.util.Random;
/**
 *
 * @author xvpow
 */
public class Test1 {
    private String msg;
    private int[] array = new int[500];
    private static Random ran = new Random();
    public static int getRandom(){
        return ran.nextInt(100000);
    }
    
    //執行時間比建構式早
    {
        for (int i = 0; i < array.length;i++){
            array[i] = getRandom();
        }        
    }
    
    Test1(){        
        
    }
    
    
    
    Test1(String msg){      
        this.msg = msg;        
    }
    


    
    public int getArrayValue(){
        return array[ran.nextInt(array.length)];
    }
}
