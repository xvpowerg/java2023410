/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch2_20230412;

/**
 *
 * @author xvpow
 */
public class Ch2_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         final int PLAY = 1;//常數
         final int STOP = 2;
         final int EXIT = 3;
        int action =PLAY;
        //常數 不可再變動的數
        //用於case的變數 只能是常數
        //switch參數可使用類型有 byte short int char String enum
        switch(action){
            case PLAY:
                System.out.println("Play");
                break;
            case STOP:
                System.out.println("Stop");
                break;
            case EXIT:
                System.out.println("Exit");
                break;
            default:
                System.out.println("Error!");
                break;
        }
        
        
        
    }
    
}
