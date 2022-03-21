import java.util.Scanner;
class Prime
{
    public static void main(String args[])
    {
        int num,count=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number:");
        num=sc.nextInt();
       for(int i=1;i<=num/2;i++)
        {
           if(num%i==0)
           {
               count++;
           }
        }
           if(count==1)
           {
               System.out.println("prime num");
           }
           else
           {
               System.out.println("not prime num");
           }
        
        
    }
}