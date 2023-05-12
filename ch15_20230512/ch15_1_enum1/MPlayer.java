/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch15_20230512.ch15_1_enum1;

/**
 *
 * @author xvpow
 */
public class MPlayer {
    public enum PlayerAction{
        PLAY,STOP,PAUSE
    }
    
    static interface MPlayerAction{
        int PLAY = 1,STOP=2,PAUSE=3;
    }
    
   public void actionEnum(PlayerAction action){
       switch(action){
           case PLAY:
                System.out.println("Play!!");
               break;
           case STOP:
                 System.out.println("Stop!!");
               break;    
            case PAUSE:
                 System.out.println("Pause!!");
               break;   
       }
   }
    
    public void action(int action){
        switch(action){
            case MPlayerAction.PLAY:
                System.out.println("Play!!");
                break;
            case MPlayerAction.STOP:
                System.out.println("Stop!!");
                break;
            case MPlayerAction.PAUSE:
                System.out.println("Pause!!");
                break;
        }
    }
}
