import java.util.Scanner;
public class Totalevenodd
{
    public static void main(String[] args) 
    {
        int n,evencount=0,oddcount=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("size of an array");
        n = sc.nextInt();
        int a[] = new int[n];
      
        for (int i = 0; i < n; i++) 
        {
            a[i] = sc.nextInt();
        }
       
        for(int i = 0 ; i < n ; i++)
        {
            if(a[i] % 2 == 0)
            {
               evencount++;
            }
            else
            {
                oddcount++;
            }
        }
               System.out.print(evencount);
               System.out.print(oddcount);
                    
    }
}