/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch13_20230508.Ch13_3_Inner3;

/**
 *
 * @author xvpow
 */
public class Ch13_3 {
    static class MyCat extends Cat{
        public void bark(){
            System.out.println("汪汪!");
        }
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Cat c1 = new Cat();
        c1.bark();
        Cat c2 = new MyCat();
        c2.bark();//汪汪
        Cat c3 = new Cat(){
            public void bark(){
               System.out.println("支支!");
            }
        
        };
        c3.bark();
        
    }
    
}
