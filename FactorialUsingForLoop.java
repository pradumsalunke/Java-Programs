import java.util.*;
class FactorialUsingForLoop
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the num: ");
		int num=sc.nextInt();
		int factorial=1;

		for(int i=1; i<=num; i++)
		{
			factorial = factorial*i;

		}
		System.out.println(factorial);
	}
}