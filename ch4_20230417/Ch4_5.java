/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch4_20230417;

/**
 *
 * @author xvpow
 */
public class Ch4_5 {
    static Integer v[] = {0,1,2,3};
    /**
     * @param args the command line arguments
     */
    
    static Integer valueOf(int a){
         //1 2 3
       
        if (a <= 3 && a>=0){
            return v[a];
        }
        return new Integer(a);
    }
    public static void main(String[] args) {
        //-128~127
        Integer v1 = 127;
        Integer v2 = 127;
        System.out.println(v1 == v2);
        
        Integer v3 = 326;
        Integer v4 = 326;
        System.out.println(v3 == v4);
        
        
//        Integer v5 = null;
//        int v6 = v5;//java.lang.NullPointerException
//        System.out.println(v6);
        
    }
    
}
