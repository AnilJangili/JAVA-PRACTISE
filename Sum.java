import java.util.Scanner;
class Sum
{
    public static void main(String args[])
    {
        int i,num,sum=0;
        Scanner sc=new Scanner (System.in);
        System.out.println("enter num  value");
        num=sc.nextInt();
        for(i=1;i<=num;i++)
        {
            sum=sum+i;
        }
        System.out.println(sum);
        
    }
}