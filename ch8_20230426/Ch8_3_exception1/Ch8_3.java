/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch8_20230426.Ch8_3_exception1;

/**
 *
 * @author xvpow
 */
public class Ch8_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Student st1 = new Student();
        st1.setName("Ken");
        //age >= 0  age<= 200
        //錯誤的年齡
        st1.setAge(25);
        st1.printInfo();


    }
    
}
