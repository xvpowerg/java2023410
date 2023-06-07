/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch26_20230607.ch26_4_thread4;
import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;
public class Ch26_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
           //ExecutorService ex =  Executors.newCachedThreadPool();
           ExecutorService ex =  Executors.newFixedThreadPool(4);
           for (int i =1; i<=100;i++){
                ex.submit(
            ()->{System.out.println(Thread.currentThread().getName());});
           }
          
           ex.shutdown();
    }
    
}
