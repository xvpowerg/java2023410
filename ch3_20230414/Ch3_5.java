/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch3_20230414;

/**
 *
 * @author xvpow
 */
public class Ch3_5 {

    public static void main(String[] args) {
        int[] intArray = new int[2];
        float[] floatArray = new float[2];
        char[] charArray = new char[2];
        boolean[] boolArray = new boolean[2];
        //Array所有參考類型預設值都是null
        String[] stringArray = new String[2];
        System.out.println(intArray[0]);//0
        System.out.println(floatArray[0]);//0.0
        System.out.println(charArray[0]);//空白字元
        System.out.println(boolArray[0]);//false
        System.out.println(stringArray[0]);//null
    }
    
}
