import java.util.Scanner;
class SmallestAmongTwo
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the num1 - ");
		int num1 = sc.nextInt();
		System.out.print("Enter the num2 - ");
		int num2 = sc.nextInt();
		int min = (num1>num2)?num2:num1;
		System.out.println(num1 +"," +num2 +" smallest among 2 numbers is " +min);
	}
}