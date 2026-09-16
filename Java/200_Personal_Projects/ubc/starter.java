/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		BaseClass test = new BaseClass();
		Scanner sc = new scanner(System.in);
		System.out.println("Please tell me a number:");
		int num = sc.nextInt();


		System.out.println(num + ", " + (num+1) + ", " + (num+2) + ", " + (num+3) + ", " + (num+4) + ", " + (num+5));
		System.out.println(num + ", " + (num*1) + ", " * (num*2) + ", " + (num*3) + ", " + (num*4) + ", " + (num*5));
		

		System.out.println(((double)num / 100.0));
		System.out.println(((double)num / 10.0);

		
	}
}
