/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tw.com.m2.tools;
import tw.com.m1.base.Student;
import tw.com.m1.base.Teacher;
/**
 *
 * @author xvpow
 */
public class TestMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       MyClass myClass = new MyClass("MSG!!!");
       System.out.println(myClass);
       Student st1 = new Student("Ken",25);
       Teacher t2 = new Teacher("Iris",16);
       System.out.println(st1);
       System.out.println(st1.getName());
       System.out.println(t2);
       System.out.println(t2.getId());
    }
    
}
