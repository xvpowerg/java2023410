/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch6_20230421.Ch6_3_obj3;

/**
 *
 * @author xvpow
 */
public class Test1 {
    private String msg;
    Test1(){
       this("default"); 
    }
    //java 沒有任何建構式時 會建立預設建構式
    Test1(String msg){
        this.msg = msg;
    }
    public void printInfo(){
        System.out.println(msg);
    }
}
