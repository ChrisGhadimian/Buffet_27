/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		System.out.println("I love to learn coding remotely."); 
		System.out.println("Welcome to the skeleton museum");
		Scanner sc = new Scanner(System.in);
		String exhibit = sc.nextLine();
		System.out.println("would you like any food or drinks?");

		if(exhibit.equals("food")){
			System.out.println("1.Ribs ");
			System.out.println("2.Salad");
			System.out.println("3. French fries ");
			String art = sc.nextLine();
			
			if(exhibit.equals("ribs")){
			System.out.println("1. $20");
			}
			else if(exhibit.equals("salad")){
			System.out.println("2. $10");
			}
			else if(exhibit.equals("French Fries")){
			System.out.println("3. $15");
			}
		}

		else if(exhibit.equals("drinks")){
		System.out.println("1. Coca cola");
		System.out.println("2. Lemonade");
		System.out.println("3. Sprite");
		String bones = sc.nextLine();

		if(bones.equals(" Coca cola")){
		System.out.println("1. $5");
		}
		else if(bones.equals("Lemonade")){
		System.out.println("2. $10");
		}
		else if(bones.equals("Sprite")){
		System.out.println("3. $5");
		}

		}
		

		else{

	
		}
	}
}
