/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch13_20230508.Ch13_1_Inner1;

/**
 *
 * @author xvpow
 */
public class InnerClass {
    private int count;
    private String name;
    InnerClass(int count){
        this(count,"");
    }
     InnerClass(int count,String name){
        this.count = count;
        this.name = name;
    }
    public class TestInner{
        //內部類可讀寫外部屬性與方法        
        private String  msg;
        private String name;
        TestInner(String msg){
            this(msg,"");
        }
        TestInner(String msg,String name){
            this.msg = msg;
            this.name = name;
        }
        public String toString(){
            return this.msg+":"+count+
                    "TestInner Name:"+name+
                    "InnerClass Name:"+InnerClass.this.name;
        }        
    }
    
    public void runTestInner(){
        TestInner t1 = new TestInner("TestInner!!!");
        System.out.println(t1);
    }
}
