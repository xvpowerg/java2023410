/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch18_20230519.Ch18_6_generic3;
import java.util.ArrayList;
public class Ch18_6 {

    static void testGener1(ArrayList<Parent> list){
        list.add(new Sub());
        System.out.println(list);
    }
    
    //? extends Parent傳入的參數類型必須是Parent 或Parent的子類
    static void testGener2(ArrayList<? extends Parent> list){
       //不可新增內容於? extends 的類型
       //可取出
       for (Parent p : list){
           System.out.println(p);
       }
    }
    //? super Sub2 傳入的參數類型必須是Sub2 或Sub2的父類
    static void testGener3(ArrayList<? super Sub2> list){
    list.add(new Sub2());
    
        for (Object sub : list){
             System.out.println(sub);
        }
    }
    
    public static void main(String[] args) {
        //泛型類型是什麼 右邊的類型必須一樣
        
        ArrayList<Sub> subList = new ArrayList<>();
       subList.add(new Sub());
       //方法的參數泛型必須與傳入參數一致
        //testGener1(subList);
        ArrayList<Sub> subList2 = new ArrayList();
        subList2.add(new Sub());
        subList2.add(new Sub());
        testGener2(subList2);
        System.out.println("======================");
        ArrayList<Sub> subList3 = new ArrayList();  
        ArrayList<Parent> subList4 = new ArrayList();  
        ArrayList<Sub3> subList5 = new ArrayList();  
        testGener3(subList3);
        testGener3(subList4);
         //testGener3(subList5);
    }
    
}
