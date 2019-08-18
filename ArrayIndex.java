
package CK_Set3;

import java.util.Scanner;

public class ArrayIndex {
     public static void main(String[]args){
        int n;
         System.out.print("Enter total elements: ");
         Scanner sc=new Scanner(System.in);
         n=sc.nextInt();
        int a[]=new int[n];
         System.out.println("Enter all elements: ");
         
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
             
        }
        
        for(int i=0;i<n;i++){
            
           
          System.out.println("Element: "+a[i]+" Index: "+i);
        }
        
    } 
    
}
