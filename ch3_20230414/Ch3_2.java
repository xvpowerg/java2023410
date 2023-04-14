/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch3_20230414;

/**
 *
 * @author xvpow
 */
public class Ch3_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] array1 = new int[3];
        int array2[] = new int[3];
        int[] array3 = {5,6,8,9,1};
        //不可加長度
        //已宣告過的變數 建立新的陣列
        int[] array4 = new int[]{9,11,2,3,8};
        
        for (int i = 0; i < array3.length;i++){
            System.out.print(array3[i]+" ");
        }
         System.out.println();
       for (int v : array4){
           System.out.print(v+" ");
       }  
         System.out.println();      
         
        array1 = new int[]{8,7,2,3};
    }
    
}
