/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch1_20230410;

/**
 *
 * @author xvpow
 */
public class Ch1_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        var v1 = 10;
        var v2 = 10;        
        System.out.println(v1 == v2);
        
        var name1 = "Ken";
        var name2 = "Ken";
        var name3 = new String("Ken");
        System.out.println(name1+","+name2+","+name3);
        System.out.println(name1 == name2);
        System.out.println(name1 == name3);
        //比內容
        System.out.println(name1.equals(name3));
        
    }
    
}
