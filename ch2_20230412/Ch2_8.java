/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch2_20230412;

/**
 *
 * @author xvpow
 */
public class Ch2_8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        for (int i = 1; i<= 5;i++){
            for (int k = 1; k <= 5-i;k++){
                System.out.print(" ");
            }
//            for(int x = i; x <=5;x++){
//                System.out.print(i);
//            }

          for(int x = 1; x <=i;x++){
                System.out.print(i);
            }
            System.out.println();
//            1
//           22
//           333
//           4444
//           55555
        }
        
    }
    
}
