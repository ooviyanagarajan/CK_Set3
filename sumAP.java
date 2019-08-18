/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package CK_Set3;

/**
 *
 * @author crm systems
 */
import java.util.*;
public class sumAP {
 
    public static void main(String args[]) 
    { 
       
        int N,A,D;
        int sum=0;
      Scanner sc=new Scanner(System.in);
       System.out.println("Enter no. of terms, N: ");
              N=sc.nextInt();
       System.out.println("Enter first term, A: ");
       A=sc.nextInt();
         
       System.out.println("Enter common diff, D: ");
       D=sc.nextInt();
             
          if((N > 100000 || N<1) || (D>100000 || D<1) || (A > 100000 || A <1)){
          System.out.println("Please enter N or A or D, > 0 and < 100000!!!");
       }else{
           for (int i = 0; i < N; i++){
             sum = sum + A; 
             A = A+ D;          
             
           }  
           System.out.println("Sum  : "+sum); 
          }
    
       
    } 
} 
    

