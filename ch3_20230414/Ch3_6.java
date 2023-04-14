/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch3_20230414;

/**
 *
 * @author xvpow
 */
public class Ch3_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int[] array1= {5,8,9,11,20};
       System.out.println(array1[3]);
       //System.out.println(array1[5]);// java.lang.ArrayIndexOutOfBoundsException
       
       int[][] array2 = new int[3][];
        array2[0] = new int[]{9,23};
        array2[2] = new int[]{7,51,33};
        System.out.println(array2[0][0]);
       // System.out.println(array2[2][3]);
        System.out.println(array2[1][2]);
    }
    
}
