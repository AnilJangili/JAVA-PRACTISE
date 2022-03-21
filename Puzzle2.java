 import java.util.Scanner;
class Puzzle2
{
    public static void main(String args[])
    {
         int count=0;
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
       System.out.println("Below 10 numbers are:");
         for (int i=0;i<row;i++)
         {
             for (int j=0;j<col;j++)
             {
            
               if( a[i][j]<10)  
               
               {
                 count=count+1;
               }
             }
                  
               
             }
         
           System.out.println(count);
         //odd number
        
    }
}