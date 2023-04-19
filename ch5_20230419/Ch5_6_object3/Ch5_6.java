/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch5_20230419.Ch5_6_object3;

/**
 *
 * @author xvpow
 */
public class Ch5_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Person p1 = new Person();
        //"".length();
        //name的長度大於等於2 小於等於30
        //不可為null
        //p1.name = "Joy";
        p1.setName("Joy");
        //p1.setName(null);
        p1.height = 180;
        //0~300
        //封裝 Encapsulation
        //封裝步驟
        //1 私有化屬性
        //2 建立公開的窗口讀寫屬性
      //  p1.age = 26;
      p1.setAge(26);
        p1.printInfo();
    }
    
}
