/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch11_20230503.Ch11_4_if2;

/**
 *
 * @author xvpow
 */
public class Ch11_4 {

    
    static void testRun(Run run){
        run.runing();
    }
    static void testJump(Jump jump){
        jump.jumping();
    }
    public static void main(String[] args) {
        // TODO code application logic here
        
        Person p1 = new Person();
        testRun(p1);
        testJump(p1);
    }
    
}
