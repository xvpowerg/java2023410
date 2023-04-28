/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch9_20230428.ch9_4_static1;

/**
 *
 * @author xvpow
 */
public class Ch9_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Employee emp1 = new Employee("Ken",500);
        Employee emp2 = new Employee("Vivin",250);
        emp1.setCompany("Google");
        System.out.println(emp1);
        System.out.println(emp2);
        emp1.setSalary(720);
        emp2.setCompany("Facebook");
        System.out.println(emp1);
        System.out.println(emp2);
    }
    
}
