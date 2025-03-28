import java.util.Scanner;

class OddEven
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a value:");
		int a = sc.nextInt();
		
		if( a % 2 == 0)
		{
			System.out.println(a + " is even no. ");
		}
		else
		{
			System.out.println(a + " is odd no. ");
		}
	}
}

	