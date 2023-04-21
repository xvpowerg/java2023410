/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch6_20230421.Ch6_5_obj5;

/**
 *
 * @author xvpow
 */
public class TvGame extends Product{
    TvGame(String name,int price){
        super(name,price);
    }
    
    public int getPrice(){
        return super.getPrice() + 1000;
    }
}
