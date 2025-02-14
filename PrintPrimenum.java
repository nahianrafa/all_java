
package com.mycompany.productfile;
import java.util.Scanner;

public class PrintPrimenum {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        int m,n,count =0, totalPrime=0;
        System.out.print("Enter your initial num: ");
        m = input.nextInt();
        System.out.print("Enter your final num: ");
        n = input.nextInt();
        
        for(int i=m; i<=n; i++){
            count =0; 
            for(int j=2; j<=i-1; j++){
                if(i%j==0){
                    count++;
                    break;
                }              
            }
            if(count==0){
                System.out.println(i);
                totalPrime++;
            }
        }
       System.out.println("Total prime number:" +totalPrime); 
    }
    
}
