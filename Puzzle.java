import java.util.Scanner;
class Puzzle
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
       // System.out.println("even numbers");
         for (int i=0;i<row;i++)
         {
             for (int j=0;j<col;j++)
             {
               if(a[i][j]!=20 && a[i][j]>10)  
               
               {
                   System.out.println("No");
                   return;
               }
               else
               {
                    System.out.println("Yes");
               }
             }
         
         }
         //odd number
        
    }
}