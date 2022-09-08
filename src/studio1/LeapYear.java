package studio1;

import java.util.Scanner;

public class LeapYear {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("What is the year? ");
		int year = in.nextInt();
		
		boolean isLeapYear = (year % 4 == 0) && (year % 100 != 0 || year % 400 == 0); 
		
		System.out.println("The year " + year + " is a leap year: " + isLeapYear);
	}
}
