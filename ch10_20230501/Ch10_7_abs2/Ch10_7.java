/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch10_20230501.Ch10_7_abs2;

/**
 *
 * @author xvpow
 */
public class Ch10_7 {

    
    
    public static void main(String[] args) {
        Employee[] emArray = {new HR("Ken",3000),
            new HR("Lucy",2000),
            new RD("Vivin",5000)};
        
        for (Employee em : emArray){
            System.out.println(em);
        }
    }
    
}
