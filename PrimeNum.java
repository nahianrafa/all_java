
package com.mycompany.productfile;
import java.util.Scanner;

public class PrimeNum {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        
        int num, count = 0;
        System.out.print("Enter any positive num");
        num = input.nextInt();
        if(num==1 || num==0){
            System.out.println("Not prime");
        }
        else{
                for(int i = 2; i<num/2; i++){
            if(num%i==0){
                count++;
                break;
            }
          }
        }
        if(count==0){
            System.out.println("Prime number.");
        }
        else{
            System.out.println("Not prime number.");
        }
        
    }
}
    
    
