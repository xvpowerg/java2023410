/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch26_20230607.ch26_3_thread3;

/**
 *
 * @author xvpow
 */
public class Ch26_3 {
    
    static class TestLock{
        private String name;
        TestLock(String name){
            this.name = name;
        }
        public synchronized void test(TestLock lock){
            try{
               Thread.sleep(100);   
            }catch(Exception ex){
                
            }
          
            lock.show();
        }
        
        public synchronized void show(){
            System.out.println(this.name);
        }
        
    }
    
   
    public static void main(String[] args) {
        TestLock testLock1 = new TestLock("TLock1");
        TestLock testLock2 = new TestLock("TLock2");
      Thread th1 = new  Thread(()->{testLock1.test(testLock2);});
      Thread th2 = new  Thread(()->{testLock2.test(testLock1);});
       th1.start();
       th2.start();
    }
    
}
