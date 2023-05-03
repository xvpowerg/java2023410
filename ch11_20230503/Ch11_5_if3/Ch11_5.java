/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch11_20230503.Ch11_5_if3;

/**
 *
 * @author xvpow
 */
public class Ch11_5 {

    static void testIronManAction(IronManAction action){
        action.attacking(60);
        action.flying();
        action.walking();
    }
    public static void main(String[] args) {
        IronMan man= new IronMan();
        testIronManAction(man);
    }
    
}
