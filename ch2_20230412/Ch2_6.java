/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch2_20230412;

/**
 *
 * @author xvpow
 */
public class Ch2_6 {
    
    static int test1(){
        System.out.println("test1");
        return 1;
    }
     static boolean test2(){
        System.out.println("test2");
        return true;
    }
     static void test3(){
        System.out.println("test3");
    }
    public static void main(String[] args) {
       for (int i = test1() ; i <= 3 && test2()   ; i++,test3()   ) {
           System.out.println("test4");
       }
    }
    //test1
    //test2
    //test4
    //test3
    //test2
    //test4
    //test3
    //test2
    //test4
    //test3
}
