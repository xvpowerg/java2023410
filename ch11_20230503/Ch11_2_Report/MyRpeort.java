/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch11_20230503.Ch11_2_Report;
import ch11_20230503.Ch11_1_ERP.ERP;
import java.util.ArrayList;
/**
 *
 * @author xvpow
 */
public class MyRpeort extends ERP{
    protected void reportStyle(ArrayList<String> data){
        for (String d : data){
            String[] tmp = d.split(",");
            Employee emp = new Employee(tmp[0]);
            emp.appendScore(Integer.parseInt(tmp[1]));
            emp.appendScore(Integer.parseInt(tmp[2]));
            emp.appendScore(Integer.parseInt(tmp[3]));
            System.out.println(emp);
        }
    }
//    public void exportReport(){
//        
//    }
}
