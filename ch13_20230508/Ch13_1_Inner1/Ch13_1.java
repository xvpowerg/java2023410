/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch13_20230508.Ch13_1_Inner1;

/**
 *
 * @author xvpow
 */
public class Ch13_1 {

    
    public static void main(String[] args) {
            InnerClass inner = new InnerClass(25);
            inner.runTestInner();
        
            InnerClass.TestInner testInner = 
                    new InnerClass(10).new TestInner("TestInner2!!!");
            System.out.println(testInner);
            
              InnerClass.TestInner testInner3 = 
                    new InnerClass(10,"InnerClass3Name!!").
        new TestInner("TestInner3!!!","TestInner3Name");
              System.out.println(testInner3);
    }
    
}
