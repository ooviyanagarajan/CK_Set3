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
public class ArrayMedian {
     public static void main(String[]args){
        int n,temp;
        double median;
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
        
        for(int i = 0; i < n; i++){
            for (int j = i + 1; j < n; j++) { 
                if (a[i] > a[j]) 
                {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
                  
        }
         System.out.print("Sorted Array: ");
        for(int i=0;i<n;i++){
             System.out.print(a[i]+ " ");
  
        }
        int Len=a.length;
        if(Len%2==0)
            median=(a[Len/2]+a[(Len-1)/2])/2.0;
        else
             median=a[Len/2];
        System.out.println("Median: "+median);
       }catch(Exception e){
            System.out.println("Please enter total terms > 1 !!!");
       }
    }
}
