/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch4_20230417;

/**
 *
 * @author xvpow
 */
public class Ch4_2 {
    //一個參數傳入函式後會被改變嗎?
    
    //所有基本型態都是call by value
    //call by value 一定不會改變參數
    static void swap(int a,int b){
      int tmp = a;
      a = b;
      b = tmp;
    }
    //所有參考型態都是call by reference
    //call by reference 可能會改變參數的內容
    static void swap(int[] array1){
        int tmp = array1[0];
       array1[0] = array1[1];
       array1[1] = tmp;
    }
    
    
    public static void main(String[] args) {
       int a = 10,b = 7;
       System.out.println(a+":"+b);
        swap(a,b);
       System.out.println(a+":"+b);
       
       int[] array1 = {7,9};
       System.out.println(array1[0]+":"+array1[1]);
        swap(array1);
        System.out.println(array1[0]+":"+array1[1]);
    }
    
}
