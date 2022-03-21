import java.util.Scanner;
class Secondlargest
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
        //sorting
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(a[i]<a[j])
                {
                    int temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        System.out.println("Sort array;");
        for(int i=0;i<n;i++)
        {
            System.out.println(a[i]);
           
        }
         System.out.println("Second largest is:"+a[1]);
    }
}