import java.util.*;
class SunnyNumber
{
 	public static void main(String[] args) {
 		Scanner sc= new Scanner(System.in);
 		System.out.println("Enter the number: ");
 		int num = sc.nextInt();
 		int newNum=num+1;
 		boolean flag=false;
 		int squareRoot=0;
 		int i;
 		for( i=1; i<=newNum/2; i++)
 		{
 			if(i*i==newNum)
 			{
 				flag=true;
 				squareRoot=i;
 				break;

 			}
 		}
 		if(flag)
 		{
 			System.out.println(squareRoot+ "is a perfect squareRoot of new num"+newNum);
 		}
 		else{
 			System.out.println(newNum+ " is not having a perfect squareRoot");
 		}
 	}
}