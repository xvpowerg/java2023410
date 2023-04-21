/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch6_20230421.Ch6_1_obj1;

/**
 *
 * @author xvpow
 */
public class Ch6_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Student st1 = new Student();
       st1.setAge(10);
       st1.setName("LuLu");
       st1.printInfo();
       
       Student st2 = new Student("Ken",25);
       st2.printInfo();
      
       Student st3 = new Student("Vivin");
        st3.printInfo();
    }
    
}
