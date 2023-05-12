/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch15_20230512.ch15_1_enum1;
import java.util.Calendar;
/**
 *
 * @author xvpow
 */
public class Ch15_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     MPlayer plyaer = new MPlayer();
    //plyaer.action(MPlayer.MPlayerAction.STOP);
     //plyaer.action(5);
     plyaer.actionEnum(MPlayer.PlayerAction.PLAY);
     Calendar c = Calendar.getInstance();
     System.out.println(c.get(Calendar.HOUR_OF_DAY)+":"+c.get(Calendar.MINUTE));
     
    }
    
}
