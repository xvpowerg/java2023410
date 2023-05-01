/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch10_20230501.Ch10_1_init1;

/**
 *
 * @author xvpow
 */
public class TestInit {
    private int[] array = new int[500];   
    
    {
        for(int i = 0; i < array.length;i++){
            array[i] = i+1;
        }    
    }
    
    public int getArray(int idx){
        return array[idx];
    }
    
    
    
}
