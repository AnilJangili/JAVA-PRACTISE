import java.util.*;
class Armstrong
{
    public static void main(String args[])
    {
        int n,count=0,temp,sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number");
        n=sc.nextInt();
       
       
    
        while(n!=0)
        {
            n=n/10;
            count++;
        
        }
        temp=n;
        while(n!=0)
        {
            int rem=temp%10;
               sum=rem+sum;
               temp=temp/10;
        }
        if(sum==n)
        {
        System.out.println("Amstrong num");
        }
       
        else
        {
            System.out.println("Not amstrong num");
        }
    }
}

