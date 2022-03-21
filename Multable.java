import java.util.*;
class Multable
{
    public static void main(String abc[])
    {
        int n,sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number");
        n=sc.nextInt();
        int i=1;
        while(i<=10)
        {
            int mul=n*i;
            System.out.println(n+"*"+i+"="+mul);
            i++;
            
        }
       
        
    }
}