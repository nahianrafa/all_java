
package com.mycompany.experimentno4;

import java.util.Scanner;


public class ExperimentNo4{

    public static void main(String[] args) {
     int num;
     Scanner input = new Scanner(System.in);
     
    
     System.out.print("Enter your positive number: ");
     num = input.nextInt();
     
     if(num%2==0){
         System.out.println("positive");
     }
     else{
          System.out.println("Negative");
     }
    }
}