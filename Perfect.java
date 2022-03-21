import java.util.Scanner;

class Perfect
{
	
	public static void main(String[] args) 
	{
		int i, num, Sum = 0 ;
	Scanner	sc = new Scanner(System.in);		
		System.out.println("\n Please Enter any Number: ");
		num = sc.nextInt();

		for(i = 1 ; i < num ; i++) 
		{
			if(num % i == 0)  
			{
				Sum = Sum + i;
			}
		}
		if (Sum == num)
		{
			System.out.format("num is a Perfect Number");
		}
		else 
		{
			System.out.format("num is NOT a Perfect Number");
		}
	}
}