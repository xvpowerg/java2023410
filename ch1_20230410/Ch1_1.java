/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch1_20230410;

/**
 *
 * @author xvpow
 */
public class Ch1_1 {
    
    public static void main(String[] args) {
        //整數
        //byte 8  -128~127
        //short 16  -32768~32767
        //int 32 -2147483648~2147483647 *
        //long 64 
        //浮點數 
        //float 32 bit
        //double 64bit   *
        //字
        //char 16bit 0~65535
        //布林
        //boolean 
        byte b1 = 56;
        short s2 = 77;
        System.out.println(b1);
        System.out.println(s2);
        System.out.println(567);//567java預設類型是int
        
        float f1 = 12.56f;
        double d1 = 3.71828;
        System.out.println(f1);
        System.out.println(d1);
        
        char c1 = 'A';
        char c2 = '@';
        System.out.println(c1);
        System.out.println(c2);
        int c1Code = c1;
        System.out.println(c1Code);
        int c2Code = c2;
        System.out.println(c2Code);
        
        boolean boo1 = true;
        boolean boo2 = false;
        System.out.println(boo1);
        System.out.println(boo2);
        //自動推斷類型
        var var1 = 10;
        System.out.println(var1);
        var var2 = 15.6f;
        System.out.println(var2);
        var2 = 25.6f;
    }
    
}
