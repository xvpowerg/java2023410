/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch7_20230424.ch7_4_2_override2;
import ch7_20230424.ch7_4_override2.Test1;
/**
 *
 * @author xvpow
 */
public class Ch7_4_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Test1 t1 = new Test1();
        System.out.println(t1.testPublic);
          Test2 t2 = new Test2();
          t2.testProtected();
    }
    
}
