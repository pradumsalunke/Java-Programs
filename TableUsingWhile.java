import java.util.*;
class TableUsingWhile
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		final int num=sc.nextInt();

		int i=1;
		while(i<=10)
		{
			System.out.println(num+"*"+i+" ="+(num*i));
			i++;
		}
	}
}