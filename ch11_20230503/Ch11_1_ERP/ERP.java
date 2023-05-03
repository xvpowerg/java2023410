/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch11_20230503.Ch11_1_ERP;
import java.util.ArrayList;
/**
 *
 * @author xvpow
 */
//final class 其他類別不可繼承
//abstract class 不可使用final
public  abstract class ERP {
    private ArrayList<String> data = new ArrayList(); 
    
    private void initData(){
        data.add("Ken,75,80,60");
        data.add("Vivin,23,94,67");
        data.add("Lucy,95,16,88");
    }
    //abstract 方法不可加上 final
    //方法加上final表示不可複寫
    protected  abstract void reportStyle(ArrayList<String> data);
   //加上final不可複寫
    public final void exportReport(){
        initData();
        reportStyle(data);
    }
}
