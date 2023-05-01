/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch10_20230501.Ch10_4_shade1;

/**
 *
 * @author xvpow
 */
public class Ch10_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Shade遮蔽
        //靜態是遮蔽
        //屬性是遮蔽
        //遮蔽 看類別
        //複寫 看物件
        
        
        Test1 t1 = new Test2();
        t1.print();
        t1.testStatic();
        System.out.println(t1.myMsg);
    }
    
}
