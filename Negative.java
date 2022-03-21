import java.util.Scanner;
class Negative
{
    public static void main(String args[])
    {
            Scanner sc=new Scanner (System.in);
            int n;
        System.out.println("enter size of an array");
        n=sc.nextInt();
        int a[]=new int[n];
        for (int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            if(a[i]<0)
        {
           
            System.out.println("negative array elements"+a[i]);
        }
         
        }
    }
}