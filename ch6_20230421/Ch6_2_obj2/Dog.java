/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch6_20230421.Ch6_2_obj2;

/**
 *
 * @author xvpow
 */
//繼承
//Animal 是 Dog 父類別
//java是單一繼承
//繼承時建構式不會被繼承
//私有的屬性
public class Dog   extends Animal {
    Dog(){}
    Dog(String name,float height){
        //super() 呼叫父類別的建構式
        //只能是第一行命令
        //只能在建構式呼叫
        super(name,height);
    }
    //複寫 override
    public void printInfo(){
        System.out.print("Dog:");
        //呼叫父類別的方法
        super.printInfo();
    }
}
