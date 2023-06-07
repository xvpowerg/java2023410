/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch26_20230607.ch26_5_thread5;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.Future;
/**
 *
 * @author xvpow
 */
public class Ch26_5 {
    public static void main(String[] args) {
        
        ExecutorService es = Executors.newCachedThreadPool();
        Random ran = new Random();
        Future<Integer> f = es.submit(()->{
            try{
                System.out.println("計算數字....");
                 TimeUnit.SECONDS.sleep(2);
            }catch(Exception ex){
                
            }
           return ran.nextInt(10000);
        });
        try{
            int v =  f.get();
            System.out.println(v);
        }catch(Exception ex){
            
        }
       es.shutdown();
        
    }
    
}
