class PasswordChecking2
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		int storedPin=123;
		int count=3;

		do{
			System.out.println("Enter your pin: ");
			int userPin=sc.nextInt();

			if(storedPin==userPin)
			{
				System.out.println("Welcome");

			}else{
				System.out.println("Wrong Pin attempt left"+count-1);
			}
			
		}
		while(count>=1);
	}
}