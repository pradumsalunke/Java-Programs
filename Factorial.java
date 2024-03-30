import java.util.*;
class Factorial
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num= sc.nextInt();
		int factorial=1;
		int i=1;
		while(i<=num)
		{
			factorial*=i;
			i++;
		}
		System.out.println(num+"! = "+factorial);
	}
}