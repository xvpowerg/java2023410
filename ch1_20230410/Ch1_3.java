/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch1_20230410;

/**
 *
 * @author xvpow
 */
public class Ch1_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int count = 10;
        count *= 2;
        System.out.println(count);
        
        int v1 = 1;
        v1++;
        ++v1;
        System.out.println(v1);
        
        int v2 = 0;
        //++v2 會先v2 = v2+1 在顯示
        //v2++ 會先將v2顯示 在v2 = v2 + 1
        System.out.println(++v2);
        
        int v3 = 1;
        int ans = 2 + ++v3 + 3 + v3++;
        //        2 + 2  +  3  + 2
        System.out.println(ans);
        System.out.println(v3);
    }
    
}
