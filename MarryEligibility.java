import java.util.Scanner;
class MarryEligibility
{
	public static void main(String[] args)
	 {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your age : ");
		int age = sc.nextbyte();
		System.out.print("Enter your property : ");
		double property = sc.nextDouble();
		sc.nextLine();
		System.out.print("Enter your surname : ");
		String surmane = sc.next().toUpperCase();


		if((age>=21 && property>=10000000)||(surname.equals("AMBANI")))
		{
            System.out.println("you are eligible for marry");
		}
         else{
         	System.out.println("not eligible for marry");
         }
	}
}