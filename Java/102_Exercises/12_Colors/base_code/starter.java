/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
        int x = 255;
        int c = 255;
        int t = 255;


        int r = (int) (Math.random() * 255);

        int g = (int) (Math.random() * 255);

        int b = (int) (Math.random() * 255);
		
        getColor(r, g, b);

        int z = 255 - r;

        int a = 255 - g;

        int f = 255 - b;

        getColor(z, a, f);


        getColor(b, r, g);
        

        getColor(g, b, r);

		// Call getColor(#, #, #);
    }

	public static void getColor(int red, int green, int blue){
        String startColor = "\u001B[48;2;" + red + ";" + green + ";" + blue + "m";
        String resetColor = "\u001B[0m";
        String swatch = startColor + "                    " + resetColor;
        System.out.println(swatch);
        
    }
}
