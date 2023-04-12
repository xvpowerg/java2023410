/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch2_20230412;

/**
 *
 * @author xvpow
 */
public class Ch2_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        //String job = "RD";
        String job = null;
        //如果switch 參數傳null會拋出java.lang.NullPointerException
        switch(job.toUpperCase()){
            case "RD":
                System.out.println("Ken");
                break;
            case "HR":
                System.out.println("Iris");
                break;
            case "PM": 
                System.out.println("Lucy");
                break;
            default:
                System.out.println("Error");
                break;
        }
        
        if (job.equalsIgnoreCase("RD"))
            System.out.println("Ken");
        else if(job.equalsIgnoreCase("HR"))
            System.out.println("Iris");
        else if (job.equalsIgnoreCase("PM"))
            System.out.println("Lucy");
       else
           System.out.println("Error");
        
        
    }
    
}
