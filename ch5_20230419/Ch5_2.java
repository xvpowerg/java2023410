/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch5_20230419;

/**
 *
 * @author xvpow
 */
public class Ch5_2 {

//多載 Overloading 會呼叫甚麼方法的規則
//1 一樣類型
//2 相同類型可相容
//3 不同類型可相容
//4 封箱類型
    
//多載 Overloading定義
//函式名稱一樣
//參數類型不一樣
//參數數量不一樣
    static void test1(int v1){
        System.out.println("int v1");
    }
    static void test1(float f2){
        System.out.println("float f2");
    }
     
    static void test2(long v1){
        System.out.println("test2 long v1");
    }
      
    static void test2(float f2){
         System.out.println("test2 float f2");
    }
    static void test3(short s1){
        System.out.println("short s1");
    }
    static void test3(long v2){
        System.out.println("long v2");
    }
    static void test4(short s1){
        System.out.println("test4 short s1");
    }
     static void test4(float f2){
        System.out.println("test4 float f2");
    }
     
     static void test5(short s1){
          System.out.println("test5 short s1");
     }
 
     static void test5(Integer v2){
          System.out.println("test5 Integer v2");
     }
     
     static void test6(byte b1){
         System.out.println("test6 byte b1");
     }
     static void test6(Float f1){
         System.out.println("test6 Float f1");
     }
    public static void main(String[] args) {
        test1(5);
        int value1 = 25;
        test2(value1);
        //單純的數字在java內是int類型
        test3(71);        
        test4(21);        
        test5(30);
        //編譯錯誤 因為Float 不接收 Integer類型
        //test6(20);
        Integer v1 = 20;
        //Float f1 = v1;
        
    }
    
}
