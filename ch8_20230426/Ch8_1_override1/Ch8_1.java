/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch8_20230426.Ch8_1_override1;

/**
 *
 * @author xvpow
 */
public class Ch8_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 只能開放不能封閉
        Test1 t1 = new Test2();
        t1.testPublic();
        t1.testProtected();
        t1.testDefault();
    }
    
}
