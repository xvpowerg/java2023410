/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch6_20230421.Ch6_2_obj2;

/**
 *
 * @author xvpow
 */
public class Cat extends Animal {
    Cat(){}
    Cat(String name,float height){
        super(name,height);
    }
    //@Override 檢查複寫(Override)是否成功
    @Override
    public void printInfo(){
        System.out.print("Cat:");
        super.printInfo();
    }
}
