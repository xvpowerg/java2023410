/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch2_20230412;

/**
 *
 * @author xvpow
 */
public class Ch2_9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        for (int i = 1; i <= 3; i++){
            for (int k = 1; k<=2;k++){
//                if (i == 2){
//                    break;
//                }
                if (i == 2){
                    continue;
                }
                System.out.print(i+":"+k+" ");                                
            }
            System.out.println();
        }
        
        
        
    }
    
}
