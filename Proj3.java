/**
 * <Proj3.java>
 * < Preston Rottinghaus / Section: 02B/ Day: Thursday/ Time: 3:30-5:20pm>
 * 
 * <The program is designed to take the users input of  2 (x,y) coordinates.
 *  Checks to see if the points entered are the same. Then if they have a slope, finally if they are inside the bounds 0 - 9.
 *  If the points are not valid prints out error and asks for points to be reentered.
 *  The program them calculates the slope and y intercept of the points. 
 *  Finally if the points are valid prints out the equation of the line in slope intercept form with a graph of the 2 points. >
 */

import java.util.Scanner;

public class Proj3 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		char cont = 'Y';
		int x1;
		int x2;
		int y1;
		int y2;
		double slope;
		double yintercept;
		int ctr;
		
		
		
		// check if user wants to continue running.
	do {
	System.out.print("Enter x1: ");
		x1 = s.nextInt();
	System.out.print("Enter y1: ");
		y1 = s.nextInt();
	System.out.print("Enter x2: ");
		x2 = s.nextInt();
	System.out.print("Enter y2: ");
		y2 = s.nextInt();
		;
			
	do {
		ctr = 0;
		// check that not same point
	if( (x1 == x2)&&(y1==y2)) {
		++ctr;
		System.out.println("Point values must be different.");
		System.out.println();
		
	}
	// check for a slope
	else if((x1 == x2)) {
		++ctr;
		System.out.println("Line between points must have a slope");
		System.out.println("(i.e. x1 and x2 must differ)");
		System.out.println();
		
	}
	//check for a slope
	else if((y1 == y2)) {
		++ctr;
		System.out.println("Line between points must have a slope");
		System.out.println("(i.e. x1 and x2 must differ)");
		System.out.println();
		
	}
	else
		
	//check x1 inside bounds
		
	if(((x1>9)||(x1 < 0))) {
		++ctr;
		System.out.println("All points must be between (0,0) and (9,9).");
		System.out.println();
		
	}
		
	//check y1 inside bounds
		
	else if (((y1>9) || (y1 < 0))) {
		++ctr;
		System.out.println("All points must be between (0,0) and (9,9).");
		System.out.println();
		

	}
		
		
	//check x2 inside bounds
	else if(((x2>9) || (x2<0))) {
		++ctr;
		System.out.println("All points must be between (0,0) and (9,9).");
		System.out.println();
		

	}

		
	//check that y2 is inside bounds
		
	else if (((y2>9)||(y2<0))) {
		++ctr;
		System.out.println("All points must be between (0,0) and (9,9).");
		System.out.println();
		

	}
	
	
	
	// if any data is false
	if (ctr>0) {
		System.out.print("Re-enter x1: ");
		x1 = s.nextInt();
	System.out.print("Re-enter y1: ");
		y1 = s.nextInt();
	System.out.print("Re-enter x2: ");
		x2 = s.nextInt();
	System.out.print("Re-enter y2: ");
		y2 = s.nextInt();
	}
	
	}while(ctr!=0);
	
		//calculate slope
	slope = (((double)y2 -(double)y1)/((double)x2 - (double)x1));
	yintercept = (double)y1 - (slope*x1);
	
	// print slope
	System.out.printf("y =%.2fx + %.2f", slope, yintercept);
	System.out.println();
	// print y axis and points
	for(int i = 9;i > 0; --i ) {
		
		if( (i != y1)&&(i != y2)){
			System.out.println(i + "|");
		}
		else if((i == y1)) {
			System.out.print(i);
			if( (x1 == 0)) {
				System.out.println("*");
			}
			else {
				System.out.print("|");
				System.out.print(" ");
				for(int x = 0;((x < x1-1));++x) {
					System.out.print("  ");
				}
				System.out.println("*");
			}
		}
		else if((i == y2)) {
			System.out.print(i);
			if( (x2 == 0)) {
				System.out.println("*");
			}
			else {
				System.out.print("|");
				System.out.print(" ");
				for(int x = 0;((x < x2-1));++x) {
					System.out.print("  ");
				}
				System.out.println("*");
			}
			
		}
	}
	//print x axis line
	for( int i = 0; i == 0; ++i) {
		System.out.print(i);
		if( i == y1){
			for(int x = 0;x < x1;++x) {
				System.out.print("--");
							}
			System.out.print("*");
			for(int x = 0;x<(9-x1);++x) {
				System.out.print("--");
							}
				}
		else if( i == y2) {
			for(int x = 0;x < x2;++x) {
				System.out.print("--");
			}
			System.out.print("*");
			for(int x = 0;x<(9-x2);++x) {
				System.out.print("--");
		}
		}
		
			else{
				for(int x = 0;x<=18;++x) {
					System.out.print("-");
								}
				}
				
				
			}
			
		
		System.out.println();
	//print x axis numbers
	for(int i = 0; i <= 9; ++i ) {
	System.out.print(" " + i);
	}
	System.out.println();
	
	// checks for continue
	System.out.print("Run program again? (y/n) ");
	cont = s.next().charAt(0);
	System.out.println();
	}while(cont == 'Y'|| cont == 'y');// end while cont loop
	
s.close();
		
	}// end class
}// end main
