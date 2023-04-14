/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch3_20230414;

/**
 *
 * @author xvpow
 */
public class Ch3_3 {
    
    public static void main(String[] args) {
        int[][] array2x3 = new int[2][3];
        array2x3[0][0] = 5;
        array2x3[0][2] = 2;
        array2x3[1][1] = 6;
        array2x3[1][2] = 7;
        
        for (int i = 0; i < array2x3.length;i++){
            for (int k = 0; k < array2x3[i].length;k++){
                System.out.print(array2x3[i][k]+" ");
            }
            System.out.println();
        }
        System.out.println();
       //foreach 
        for (int[] data : array2x3){
            for (int v : data){
                System.out.print(v+" ");
            }
            System.out.println();
        }
        
    }
    
}
