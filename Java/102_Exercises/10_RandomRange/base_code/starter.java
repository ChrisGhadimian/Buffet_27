/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		System.out.println("I love to learn coding remotely."); 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number between 10 and 20");
		int userNumber = sc.nextInt();
		System.out.print("please enter an integer:");
		userNumber = sc.nextInt();
		System.out.print("please enter another integer:");
		int userNumber2 = sc.nextInt();
		System.out.println("The range is: " + (int)(Math.random() * (userNumber2 - userNumber + 1) + userNumber));
		System.out.println("here is 5 numbers generated in that range.");
		int num1 = (int)(Math.random() * (userNumber2 - userNumber) + userNumber);
		int num2 = (int)(Math.random() * (userNumber2 - userNumber) + userNumber);
		int num3 = (int)(Math.random() * (userNumber2 - userNumber) + userNumber);
		int num4 = (int)(Math.random() * (userNumber2 - userNumber) + userNumber);
		int num5 = (int)(Math.random() * (userNumber2 - userNumber) + userNumber);
		System.out.println(num1 + ", " + num2 + ", " + num3 + ", " + num4 + ", " + num5);
	}	
}
