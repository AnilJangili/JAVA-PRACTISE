import java.util.Scanner;
class Copy
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
        int a1[]=new int[a.length];
        for(int i=0;i<a.length;i++)
        {
            a1[i]=a[i];
        }
        //Original array
        System.out.println("Original Array");
        for(int i=0;i<a.length;i++)
        {
            System.out.println("a["+i+"]="+a[i]);
        }
        for(int i=0;i<a.length;i++)
        {
            System.out.println("a1["+i+"]="+a1[i]);
        }
    }
}