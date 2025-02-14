
package com.mycompany.productfile;
import java.util.Scanner;

public class ConditionalOperator {
    
    public static void main(String[] args){
       Scanner input = new Scanner(System.in);
       
       System.out.println("Enter your two numbers: ");
       
       int num1,num2,large;
       
       num1 = input.nextInt();
       num2 = input.nextInt();
       
       large = (num1>num2) ? num1:num2;
       
       System.out.println("Large number = "+large);
       
       
        
        
        
        
    }
    
}
