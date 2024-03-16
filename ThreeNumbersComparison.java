import java.util.Scanner;
class ThreeNumbersComparison
{
    public static void main(String[] args) 
    {
    	int num1 = 3;
    	int num2 = 5;
    	int num3 = 6;
    	System.out.println((num1<num2)?((num1<num3)?(num1):num3):((num2<num3)?(num2):(num3)));
    }
}