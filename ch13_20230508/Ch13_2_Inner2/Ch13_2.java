/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch13_20230508.Ch13_2_Inner2;
import ch13_20230508.Ch13_2_Inner2.InnerClass2.StaticInner;
/**
 *
 * @author xvpow
 */
public class Ch13_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        InnerClass2.StaticInner st1 = new InnerClass2.StaticInner("StaticInner1");
        System.out.println(st1.getName());
        StaticInner st2 = new StaticInner("StaticInner2");
         System.out.println(st2.getName());
    }
    
}
