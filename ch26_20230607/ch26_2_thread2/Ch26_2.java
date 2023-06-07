/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch26_20230607.ch26_2_thread2;

/**
 *
 * @author xvpow
 */
public class Ch26_2 {
    static class Test1{
        int x = 1;
        public synchronized void myRun(){
             
            for (int i =1; i<= 10; i++){
                System.out.println(x);
                ++x;
            }
        }
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Test1 test1 = new Test1();
        Thread t1 = new Thread(()->{test1.myRun();});
        Thread t2 = new Thread(()->{test1.myRun();});
        t1.start();
        t2.start();
        
      
        
    }
    
}
