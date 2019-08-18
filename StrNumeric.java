

import java.util.*;
public class StrNumeric {
  
    public static void main(String[] args) {
        String str;
       System.out.println("Enter string: ");
       Scanner sc=new Scanner(System.in);
        str= sc.nextLine();
        
        try{ 
          int numeric=Integer.parseInt(str);
          System.out.println("Numeric");
        }catch(Exception e){
         System.out.println("Not numeric");   
        }
    }
}
