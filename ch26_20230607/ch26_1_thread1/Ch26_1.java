/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch26_20230607.ch26_1_thread1;

/**
 *
 * @author xvpow
 */
public class Ch26_1 {

    private  static class MyRun implements Runnable{
        public void run(){
            for(int i =1;i<=10;i++){
                System.out.println(i+":"+Thread.currentThread().getName());
            }
        }
    }
    public static void main(String[] args) {
        System.out.println("Start Name:"+Thread.currentThread().getName());
        MyRun myRun = new MyRun();
       Thread th1 = new Thread(myRun);
       th1.start();
       //myRun.run();
     System.out.println("End Name:"+Thread.currentThread().getName());   
        
    }
    
}
