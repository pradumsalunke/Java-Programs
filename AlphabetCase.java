import java.util.Scanner;
class AlphabetCase
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Charcter ");
		char ch = sc.next().CharAt(0);

        System.out.println(((ch>='A'&&ch<='Z')||(ch>='a'&&ch<='z')?((ch>='A'&&ch<='Z')?"Uppercase":"Lowwercase")):"is alphabet":"not alphabet");

	}
}