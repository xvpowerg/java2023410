/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch22_20230529.Ch22_4_io4;

/**
 *
 * @author xvpow
 */
public class TestAutoClose implements AutoCloseable{
    private String msg;
    private boolean throwEx;
    TestAutoClose(String msg){
        this.msg = msg;
    }
    TestAutoClose(String msg,boolean throwEx){
        this.msg = msg;
        this.throwEx = throwEx;
    }
    
    public String toString(){
        return msg;
    }
    
    public void close()throws Exception{
         System.out.println("close:"+msg);
        if (throwEx){
            throw new RuntimeException(msg);
        }
       
    }
}
