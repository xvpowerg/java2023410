/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch6_20230421.Ch6_5_obj5;

/**
 *
 * @author xvpow
 */
public class Ch6_5 {

    /**
     * @param args the command line arguments
     */
    static void printProduct(Product p){
        p.printInfo();
    }
    public static void main(String[] args) {
        // TODO code application logic here
        //多型
        Product p1 = new MyPhone("MyPhone1",8500);
        p1.printInfo();
        Product tv2 = new TvGame("TvGame2",7200);
        tv2.printInfo();
        printProduct(p1);
        printProduct(tv2);
    }
    
}
