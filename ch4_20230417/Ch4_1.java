/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch4_20230417;

/**
 *
 * @author xvpow
 */
public class Ch4_1 {
    
   static void test1(){
        System.out.println("Ch4_1 Test1");
    }
   static int test2(int a,int b){
       int ans = a + b;
       //將函式的數值輸出函示 並離開函式
       return ans;
   }

    static int sum(int a,int b){
        int ans = a + b;
        return ans;
    }
    
    static int sum(int[] array){
        int total = 0;
        for (int v : array){
            total += v;
        }
        return total;
    }
    //長參數
    //長參數位置只能放在參數的最後一個
    static int sum2(int ... values){
        int total = 0;
        for (int v : values){
            total += v;
        }
        return total;
    }
    //長參數位置只能放在參數的最後一個
    static String test3(String title,String end,int ... values){
        String msg = "";
        msg += title+" ";
        for (int v : values){
             msg += v+" ";
        }
        msg += end;
        
        return msg;
    }
    //static 函式只能呼叫static類型
    public static void main(String[] args) {
       String msg =  test3("Scores",".",72,86,99,54);
        System.out.println(msg);
        test1();  
        int v1 = test2(5,6);
        System.out.println(v1);
        int v2 = sum(7,2);
        System.out.println(v2);
        int[] values = {7,2,1,4,9,5,8};
        int v3 = sum(values);
        System.out.println(v3);
        
        int v4 = sum2();
        System.out.println(v4);
        int v5 = sum2(1,5,6);
        System.out.println(v5);
        int v6 = sum2(values);
        System.out.println(v6);
        
    }
    
}
