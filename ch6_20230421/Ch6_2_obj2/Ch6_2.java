/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch6_20230421.Ch6_2_obj2;

/**
 *
 * @author xvpow
 */
public class Ch6_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Animal a1 = new Animal("BoBo",10.5f);
        a1.printInfo();
        Dog dog1 = new Dog();
        dog1.setName("Yuyu");
        dog1.setHeight(12);
        dog1.printInfo();
        Dog dog2 = new Dog("nana",15f);
        dog2.printInfo();
        
        Cat cat1 = new Cat("myCat",5.2f);
        cat1.printInfo();
    }
    
}
