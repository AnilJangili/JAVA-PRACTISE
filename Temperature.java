/* JFM1T5_Assignment3:

   Write a program to store the temperature of your city for last 7 days and print the lowest temperature of the week.
   Prompt the user input from the terminal.
   
   Sample Input:
   Enter number of days 
   3
   Enter the temperature of Day :1
   88
   Enter the temperature of Day :2
   34
   Enter the temperature of Day :3
   0 
   
   Expected Output:
   The lowest temperature of the week 3 is 0.0 celsius

*/


import java.util.Scanner;

public class Temperature{
 public static void main(String args[])
    {
       
            int i;
            int n;
            double min;
            double a[]=new double[10];
             Scanner sc=new Scanner (System.in);
        System.out.println("Enter number of days:");
        n=sc.nextInt();
        
        for ( i=0;i<=n;i++)
        {
            System.out.println("The Temperature of"+i+"day is:");
            a[i]=sc.nextDouble();
        }
        min=a[0];
        for( i=0;i<n;i++)
        {
           if(min>a[i])
           {
               min=a[i];
           }
        }
        System.out.println("Lowest Temperature is:"+min);
    }
}