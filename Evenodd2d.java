import java.util.Scanner;
class Evenodd2d
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("enter row value");
        int row=sc.nextInt();
         System.out.println("enter col value");
        int col=sc.nextInt();
        int a[][]=new int[row][col];
         System.out.println("enter array elements");
        for (int i=0;i<row;i++)
        {
            for (int j=0;j<col;j++)
            {
            a[i][j]=sc.nextInt();
            }
        }
        //even number
        System.out.println("even numbers");
         for (int i=0;i<row;i++)
         {
             for (int j=0;j<col;j++)
             {
               if(a[i][j]%2==0)  
               
               {
                   System.out.println(a[i][j]);
               }
             }
         
         }
         //odd number
         System.out.println("odd numbers");
         for (int i=0;i<row;i++)
         {
             for (int j=0;j<col;j++)
             {
               if(a[i][j]%2!=0)  
               
               {
                   System.out.println(a[i][j]);
               }
             }
         
         }
    }
}