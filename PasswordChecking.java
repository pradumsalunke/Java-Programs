import java.util.*;
class PasswordChecking
{
	public static void main(String[] args) throws InterruptedException
	{
		Scanner sc= new Scanner(System.in);

		int attempt=1;

		outerloop:
		for( ; ; )
		{
			int storedPin=123;
			int count=3;

			do{
				System.out.println("Enter your pin: ");
				int userPin=sc.nextInt();

				if(userPin==storedPin)
				{
					System.out.println("Welcome");
					break outerloop;
				}
				else{
					System.out.println("Wrong Pin Attempt left "+(count-1));
					System.out.println(count);
				}
				if(count==1)
				{
					Thread.sleep(5000);
					System.out.println("You can try to enter your pin again");
				}
				count--;
			}while(count>=1);
			if(attempt++ ==2)
			{
				break;
			}
		
		}
	}
}