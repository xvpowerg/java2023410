/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch13_20230508.Ch13_5_lambda1;

/**
 *
 * @author xvpow
 */
public class Ch13_5 {

    static void runAction(TestAction ta){
        ta.action();
    }
    public static void main(String[] args) {
        // TODO code application logic here
        TestAction t1 = ()->{
            System.out.println("MyAction1");
        };
        t1.action();
        
        runAction(()->System.out.println("MyAction2"));
    }
    
}
