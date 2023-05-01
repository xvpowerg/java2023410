/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch10_20230501.Ch10_8_time1;
import java.util.Calendar;
import java.time.LocalDate;
import java.time.LocalTime;
/**
 *
 * @author xvpow
 */
public class Ch10_8 {

    public static void main(String[] args) {
       Calendar cal = Calendar.getInstance();
        System.out.println(cal.get(Calendar.YEAR) +"//"+
                (cal.get(Calendar.MONTH)+1)+"//"+cal.get(Calendar.DATE));
        
        LocalDate date1 = LocalDate.now();
        System.out.println(date1.getYear()+"/"+date1.getMonthValue()+"/"+date1.getDayOfMonth());
        
        LocalTime time = LocalTime.now();
        System.out.println(time.getHour()+":"+time.getMinute()+":"+time.getSecond());
        
    }
    
}
