import java.util.Scanner;
class FibonacciNo
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number : ");
		int num = sc.nextInt();

		int n1 = 0;
		int n2 = 1;
		int temp;

		while(true)
		{
			temp = n1 + n2;

			if(n1 == num)
			{
				System.out.println("It's a fibonacci number");
				break;
			}
			else if(n1 > num)
			{
				System.out.println("It's not a fibonacci number");
				break;
			}

			n1 = n2;
			n2 = temp;
		}
	}
}