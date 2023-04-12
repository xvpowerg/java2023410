/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch2_20230412;

/**
 *
 * @author xvpow
 */
public class Ch2_13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] array1 = new int[5];
        array1[0] = 7;
        int i = 2;
        array1[i] = 5;
        i+=2;
        array1[i] = 2;
        
        for (int k = 0; k < array1.length; k++){
            if (k %2 == 0){
                System.out.print(array1[k]+" ");
            }            
        }
        System.out.println();
        //foreach        
        for (int v : array1){
            System.out.print(v+" ");            
        }
         System.out.println();
    }
    
}
