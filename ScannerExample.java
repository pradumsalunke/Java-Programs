import java.util.Scanner;
class ScannerExample
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your name : ");
		String name = sc.next().toLowerCase();
		char ch = name.charAt(0);
		System.out.println("Hii my name is "+name+" and my first character is "+ch);

		if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
		{
			System.out.println("Charcter "+ ch +" is a vowel.");
			
		}
		else
			{
				System.out.println("Charcter "+ch +"is a vowel.");
			}
	}
}