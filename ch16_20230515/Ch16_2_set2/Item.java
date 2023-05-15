/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch16_20230515.Ch16_2_set2;

/**
 *
 * @author xvpow
 */
public class Item {
    private int id;
    private String name;
    
    Item(int id,String name){
        this.id = id;
        this.name = name;
    }
    
    public String toString(){
        return this.id+":"+this.name;
    }
    
    public boolean equals(Object obj){
         System.out.println("equals Name:"+name);
        if (obj == null || obj instanceof Item == false ){
            return false;
        }
        Item tmp = (Item)obj;
        return this.id == tmp.id && this.name.equals(tmp.name);
    }
    //hashCode 不一樣物件一定不同
    //hashCode 一樣物件 可能相同也可能不同
   public int hashCode(){
       System.out.println("hashCode Name:"+name);
       return this.id + this.name.hashCode();
   }
}
