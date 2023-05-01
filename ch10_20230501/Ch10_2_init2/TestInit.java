/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch10_20230501.Ch10_2_init2;

/**
 *
 * @author xvpow
 */
public class TestInit {
    private final static int[] array = new int[500];
    static{
      for (int i = 0; i < array.length;i++){
          array[i] = i + 1;
      }
    
    }
    public static int getArrayValue(int idx){
       return  array[idx];
    }
}
