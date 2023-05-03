/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch11_20230503.Ch11_7_if5;

/**
 *
 * @author xvpow
 */
public class Ch11_7 {

    
     static void onClick(Action action){
        action.testRun();
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        MyAction action1 = new MyAction();
        onClick(action1);
    }
    
}
