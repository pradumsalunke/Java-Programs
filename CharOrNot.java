//write a java program to find the Character is alphabet or not

import java.util.Scanner;
class CharOrNot
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Charcter : ");
		char ch = sc.next().charAt(0);
		System.out.println(((ch>='A' && ch<='Z')|| (ch>='a' && ch<='z'))?"alphabet":"not alphabet"); 

	}
}