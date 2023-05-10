/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tw.com.m1.main;
import tw.com.m1.base.Student;
import tw.com.m1.base.Teacher;
import tw.com.m1.base2.Car;
/**
 *
 * @author xvpow
 */
public class TestMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Student st1 = new Student("Ken",18);
       Teacher t1 = new Teacher("A001",2);
       Car c1 = new Car(2,"bmw");
       System.out.println(st1);
       System.out.println(t1);
       System.out.println(c1);
        
        
    }
    
}
