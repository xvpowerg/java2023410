/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch6_20230421.Ch6_4_obj4;

/**
 *
 * @author xvpow
 */
public class Test2  extends Test1{
    //每個建構式都會呼叫super()
    //除非 自己呼叫了this() 或 super()
    public Test2(){
       super(10);     
    }   
    
    public Test2(int v){
        super(v);
    }
    
}
