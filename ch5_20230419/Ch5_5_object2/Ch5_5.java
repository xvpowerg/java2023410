/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch5_20230419.Ch5_5_object2;

/**
 *
 * @author xvpow
 */
public class Ch5_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Product p1 = new Product();
        Product p2 = new Product();
        Product p3 = new Product();
        p1.name = "A1";
        p1.price = 25;
        p2.name = "B2";
        p2.price = 31;   
        p3.name = "C3";
        p3.price = 89;   
        
        Product[] pArray = {p1,p2,p3};
        for (Product p :pArray){
            p.printInfo();
        }
              
    }
    
}
