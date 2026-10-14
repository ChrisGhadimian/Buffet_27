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
		

		Math.max(3,6);

		Math.sqrt(4);

		Math.pow(3,5);

		Scanner sc = new Scanner(System.in);

		System.out.println("Would you like to be a Wizard, a Rogue, or a Warrior? ");
		
		String Chris = sc.nextLine();

		if(Chris.equals("Wizard")){
		System.out.println("You've chosen the Wizard! You can spend 20 points on each upgrade you choose below ");
		}

		else if(Chris.equals("Rogue")){
		System.out.println("You've chosen the Rogue! You can spend 20 points on each upgrade you choose below ");
		}

		else if(Chris.equals("Warrior")){
		System.out.println(" You've chosen the Warrior! You can spend 20 points on each upgrade you choose below ");
		}

		System.out.println("Strength, Buff and able to carry larger items!");
		System.out.println("Dexterity - Agile and moves quick!");
		System.out.println("Intelligence, Better at magic spells!");
		System.out.println("Charisma, How personable");

		


	}
}
