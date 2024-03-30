// Buzz numbers are numbers that either contain the digit 7 or are divisible by 7.
//  For example, 7, 14, 17, 21, 27, and so on, are buzz numbers. 
//  These numbers are called buzz numbers because they create a buzz or excitement 
//  when encountered due to the presence of the digit 7 or their divisibility by 7.
import java.util.*;
class BuzzNumber
{
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number");
	int num=sc.nextInt();

	if((num%7==0) || (num%10==7))
		{
			System.out.println("is a buzz number");
		}
else {
	System.out.println("Number is not a buzz number");
    }
}
}