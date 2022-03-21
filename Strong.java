import java.util.Scanner;
class Strong
{
    public static void main(String args[])
    {
        int num, i,fact=1,d,sum=0,temp;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number:");
         num=sc.nextInt();
        temp=num;
        
         while(num!=0)
         {
             i=1;
             d=num%10;
             i++;
         
        for( i=1;i<=d;i++)
        {
            fact=fact*i;
            
        }
        sum=sum+fact;
            num=num/10;
         }
        if(sum==temp)
        {
        System.out.println("strong no");
        }
    else
    {
        System.out.println("not strong no");
    }
    }
}