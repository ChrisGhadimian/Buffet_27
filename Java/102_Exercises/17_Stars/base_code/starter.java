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
		System.out.print("I love to learn coding remotely."); 

	 	Scanner sc = new Scanner(System.in);

		
		System.out.print("please enter a width ");
		int width = sc.nextInt();
		System.out.print("please enter a height ");
		int height = sc.nextInt();


		int count2 = 0;
		while(true){
		if(count2 == height){
			break;
		}
		System.out.print("*");
		count2++;

		int count = 0;
		while(true){
			if(count == width){
				break;
			}
			System.out.print("*");
			count++;
		
		}
		System.out.println();
	count2++;

		}
	}
}

