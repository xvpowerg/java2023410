/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch3_20230414;
import java.util.Arrays;
/**
 *
 * @author xvpow
 */
public class Ch3_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int[] array1 = {11,8,25,9,13};
        //排序預設是小到大ASC
        Arrays.sort(array1);
        for (int v: array1){
            System.out.print(v+" ");
        }
        System.out.println();
        
        int idx1 = Arrays.binarySearch(array1, 13);
        System.out.println(idx1);
        //比所有都小 -1
       int idx2 =  Arrays.binarySearch(array1, 1);
       System.out.println(idx2);
        //比所有都大(陣列長度+1)*-1
        int idx3 = Arrays.binarySearch(array1, 100);
        System.out.println(idx3);
        //在中間
        int idx4 = Arrays.binarySearch(array1,10);
        System.out.println(idx4);
    }
    
}
