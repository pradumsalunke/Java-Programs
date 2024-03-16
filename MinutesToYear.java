import java.util.Scanner;
class MinutesToYear
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of minutes - ");
        long min = sc.nextLong();
        long days = min/(24*60);
        long year = min/(365*24*60);
        long remainingDay = (min-(year*365*24*60))/(24*60);
        System.out.println(min+"minutes is approximately "+year+" years and "+remainingDay+" days");
	}
}