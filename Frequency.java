import java.util.Scanner;
class Frequency
{
    public static void main(String args[])
    {
            Scanner sc=new Scanner (System.in);
            int n,num,count=0;
        System.out.println("enter size of an array");
        n=sc.nextInt();
        int a[]=new int[n];
        for (int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("enter element to find freq");
        for(int i=0;i<n;i++)
        {
            if(a[i]== num)
            
            {
               count=count+1;
            }
        }
            System.out.println("repeated"+count);
           if(count==0)
           {
               System.out.println("Element not found");
           }
        
       
    }
}