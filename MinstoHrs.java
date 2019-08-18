
import java.util.*;
public class MinstoHrs {
     public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int min;
        System.out.print("Enter the minutes to convert:");
        min =input.nextInt();
        int hr=min/60;
        int m=min%60;
        System.out.println(hr+" hours"+" "+m+" minutes");     
     }
    
}
