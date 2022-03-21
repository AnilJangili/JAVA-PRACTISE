import java.util.Scanner;
class Scannerarray
{
    public static void main(String args[])
    {
            Scanner sc=new Scanner (System.in);
            int n;
        System.out.println("enter size of an array");
        n=sc.nextInt();
        for (int i=1;i<5;i++)
        {
            a[i]=sc.nextInt();
        }
        for(int i=1;i<5;i++)
        {
            System.out.println("the array is:");
            System.out.println(a[i]);
        }
    }
}