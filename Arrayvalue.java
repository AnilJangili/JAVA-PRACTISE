import java.util.Scanner;
class Arrayvalue
{
    public static void main(String args[])
    {
         int a[]=new int[n];
        Scanner sc=new Scanner (System.in);
        System.out.println("enter arry element");
        for (int i=1;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(int i=1;i<n;i++)
        {
            System.out.println("the array is:");
            System.out.println(a[i]);
        }
    }
}