/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch5_20230419.Ch5_4_object1;

/**
 *
 * @author xvpow
 */
public class Ch5_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //類別 模型
        //模型建立 物件
        Student st1 = new Student();
        st1.name = "Ken";
        st1.age = 18;
//        System.out.println(st1.name +":"+st1.age);
        
        Student st2 = new Student();
        st2.name = "Vivin";
        st2.age = 23;
//        System.out.println(st2.name +":"+st2.age);
        //name = Vivin
        //age = 23
        //輸出Vivin:23
        
        st1.printInfo();
        st2.printInfo();
        
    }
    
}
