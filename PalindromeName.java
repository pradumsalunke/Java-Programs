import java.util.*;
class PalindromeName
{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the name : ");
		String name =sc.next();
		String revname;

		for(int i=name.length()-1; i>=0; i--)
		{
			revname += name.charAt(i);

		}
		System.out.println((revname.equals(name))?name+"Palindrome":name+"Not Palindromeja");
	}
}