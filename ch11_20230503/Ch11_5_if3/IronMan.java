/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch11_20230503.Ch11_5_if3;

/**
 *
 * @author xvpow
 */
public class IronMan implements IronManAction{
    public void flying(){
        System.out.println("IronMan flying");
    }
    
    public void attacking(int power){
        System.out.println("IronMan attacking");
    }
    
    public void walking(){
        System.out.println("IronMan walking");
    }
    
}
