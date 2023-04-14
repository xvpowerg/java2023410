/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch3_20230414;

/**
 *
 * @author xvpow
 */
public class Ch3_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] array1 = new int[2][3];
        int[] array2[] = new int[2][3];
        int array3[][] = new int[2][3];
        
        int[][] array4 = {{5,6,3},{4,8,10,7}};
        int[][] array5 = new int[][]{
            {2,3},{9,11,16}
        };
        int[][] array6 = new int[3][];
        array6[0] = new int[2];
        array6[1] = new int[]{8,9,11,12};
        array6[2] = new int[]{3,2};
         
        for (int i = 0; i < array4.length;i++){
            for (int k = 0; k <array4[i].length ;k++){
                System.out.print(array4[i][k]+" ");                        
            }
            System.out.println();
        }
          System.out.println();
        
         for (int[] data : array5){
             for (int v :data){
                 System.out.print(v+" ");
             }
              System.out.println();
          }
    }
    
}
