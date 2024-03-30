import java.util.*;
class Bank
{
	static String name;
	static String address;
	static long adharNo;
	static long phoneNo;
	static double bal;
	static int upiPin;
 	public static void main(String[] args) 
 	{
 		Scanner sc= new Scanner(System.in);

 		outerloop:
 		for( ; ; )
 		{
 			System.out.println("****** Welcome to LaxmiUrbanBank ******");
 			System.out.println();
 			System.out.println("1. Create Account");
 			System.out.println("2. Existing Account Holder");
 			System.out.print("Enter an option : ");
 			int option = sc.nextInt();
 			System.out.println();

 			switch(option)
 			{
 				case 1:{
 					System.out.println("**** Create Account Module ****");
 					sc.nextLine();
 					System.out.println("Enter your Name : ");
 					name =sc.nextLine();
 					System.out.println("Enter your Adress : ");
 					address = sc.nextLine();
 					System.out.println("Enter your Phone number : ");
 					phoneNo = sc.nextLong();
 					System.out.println("Enter your Adha Card Number : ");
 					adharNo= sc.nextLong();
 					System.out.println("Enter UPI Pin : ");
 					upiPin = sc.nextInt();
 					System.out.println("Account Created Successfully");
 					System.out.println();
 					break;
 				      }

 				case 2:{

					for( ; ;){
 					System.out.println();
 					System.out.println("*** Features ***");
 					System.out.println("1. Check Balance 2. Deposit 3. Withdraw 4.Information 5.Logout");
 					System.out.println();
 					System.out.println("Enter the option : ");
 					int opt = sc.nextInt();
 					switch(opt)
 					{
 					case 1:{
 						System.out.println("**** Check Balance");
 						System.out.println("Enter your upiPin : ");
 						int enteredUpiPin = sc.nextInt();
 						if(enteredUpiPin==upiPin)
 						{
 							System.out.println("Your account balance is "+bal + "rs");
 						} 
 						else {
 							System.out.println("Wrong UpiPin");
 						}
 						break;
 					}

 					case 2: {
 						System.out.println("**** Deposit amount ****");
 						System.out.println();
 						System.out.println("Enter Amount : ");
 						double depositAmount=sc.nextDouble();
 						bal = bal+depositAmount;
 						System.out.println("Amount Deposited Successfully");
 						break;
 					}

 					case 3: {
 						System.out.println("**** Withdraw Amount ****");
 						System.out.println();
 						System.out.println("Enter the Amount : ");
 						double withdrawAmount = sc.nextDouble();
 						if(withdrawAmount<=bal){
 							System.out.println("Amount Withdrawn Successfully");
 						}
 						else{
 							System.out.println("Insufficient Funds");
 						}
 						break;
 					}

 					case 4: {
 						System.out.println("**** Account Information ****");
 						System.out.println();
 						System.out.println("Account Holder name : "+name);
 						System.out.println("Adress : "+address);
 						System.out.println("Phone number : "+phoneNo);
 						System.out.println("Adhar number"+adharNo);
 						break;
 					}
 					case 5: {
 						System.out.println("LoggedOut Successfully");
 						System.exit(0);
 					}
 					default: System.out.println("Invalid Input");break;
 					}
 				}
 		    }
 			default:System.out.println("Invalid option");break;
 			        
 			}
 			
 		}
 	}
}