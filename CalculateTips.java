import java.util.Scanner;
class calculateTips
{
	
	public static void main(String[] args) 
	{
         Scanner sc = new Scanner(System.in);
         System.out.print("Enter the sub total bill :");
         double subTotal = sc.nextDouble();
         System.out.print("Enter the tip rate : ");
         double tipRate = sc.nextDouble();

         double total = subTotal + tipRate*(subTotal/100);
         System.out.println("Subtotal is "+subTotal+" and the tiprate is "+tipRate+"so the total bill after the tip is "+total);
         System.out.println("Thank u visit again"); 
	}
}