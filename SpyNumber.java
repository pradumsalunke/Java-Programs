import java.util.*;
class SpyNumber
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num=sc.nextInt();
		int originalNum=num;
		int sum=0;
		int product=1;

		while(num!=0)
		{
			int rem=num%10;
			sum=sum+rem;
			product=product*rem;
			num=num/10;
		}
		if(sum==product)
		{
			System.out.println(originalNum+" is a SpyNumber");
		}
		else {
			System.out.println(originalNum+ " is not a SpyNumber");
		}

   	
	}
}