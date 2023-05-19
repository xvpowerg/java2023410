/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch18_20230519.Ch18_4_generic1;
import java.util.ArrayList;
import java.util.function.Consumer;

public class MyList<T> {
    private ArrayList<T> dataList = new ArrayList();
    public T get(int i){
        return dataList.get(i);
    }
    public void add(T v){
        
        dataList.add(v);
    }
    public void foreach(Consumer<T> c){
        dataList.forEach(c);
    }
}
