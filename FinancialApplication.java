import java.util.Scanner;
class FinancialApplication
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the investmentAmount ");
		double investmentAmount =sc.nextDouble();
		System.out.println("Enter the annualInterestRate ");
		double annualInterestRate = sc.nextDouble();
		System.out.println("Enter the numberOfYear ");
        double numberOfYear = sc.nextDouble();
        System.out.println("Enter the futureInvestmentValue ");
        //double monthlyInterestRate = annualInterestRate/12;
        double futureInvestmentValue = investmentAmount*(1+annualInterestRate)*numberOfYear*12;
        System.out.println("Accumulated value is "+futureInvestmentValue);
	}
}