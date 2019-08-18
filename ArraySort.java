
import java.util.Scanner;

public class ArraySort {
    public static void main(String[]args){
        int n,temp;
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
       }catch(Exception e){
            System.out.println("Please enter total terms > 1 !!!");
          
       }
          
        
      
     
        
    }
}
