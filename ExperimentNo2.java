
package com.mycompany.experimentno2;

import java.util.Scanner;


public class ExperimentNo2 {

    public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in);
        
        int phoneprice;
        int numberOfinstallment, installmentPermonth;
        
        System.out.print("Enter your phone price= ");
        phoneprice = input.nextInt();
       
        System.out.print("Enter your numberOfinstallment= ");
        numberOfinstallment = input.nextInt();
        
        installmentPermonth = phoneprice/numberOfinstallment;
        
        System.out.println("InstallmentPermonth = "+installmentPermonth +"euros");
        
        
        
        
        
        
        
        
        
    }
}
