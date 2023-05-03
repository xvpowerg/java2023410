/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch11_20230503.Ch11_8_if6;

/**
 *
 * @author xvpow
 */
public class Ch11_8 {

    static void showList(MyIterator it){
        it.foreach();
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Student st1 = new Student("Ken");
        st1.addScore(75);
        st1.addScore(83);
        st1.addScore(65);
        showList(st1);
    }
    
}
