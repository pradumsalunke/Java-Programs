import java.util.*;
class NeonNumber
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = sc.nextInt();

		boolean flag = false;
		int squareRoot=0;
		for(int i=1; i<=num/2; i++)
		{
			if(i*i==num)
			{
				flag=true;
				squareRoot=i;
				break;

			}
		}
		if(flag)
		{
			System.out.println(squareRoot+" is a perfect square root of num"+ num);
		}
		else{
			System.out.println(num+"do not have a perfect square root");
		}
	}
}