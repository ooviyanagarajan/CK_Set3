/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package CK_Set3;

import java.util.*;
public class ArrayMax {
    public static void main(String[]args){
        int n;
         System.out.print("Enter total elements: ");
         Scanner sc=new Scanner(System.in);
         n=sc.nextInt();
         if(n>100000){
             System.out.println("Please enter number of terms < 100000");
         }
         else 
      try{
        int a[]=new int[n];
        System.out.println("Enter all elements: ");
         
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
    
        int maximum=a[0];
        for(int i = 0; i < n; i++){
            if(maximum < a[i])
            {
             maximum = a[i];
            }
        }
        System.out.println("Maximum: "+maximum); 
      }catch(Exception e){ 
              System.out.println("Please enter total terms > 1 !!!");
      }
          
    
        
    }
    
}
