package lesson1;

import java.util.Scanner;

public class GettingInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("enter some no.:");
		int userInputNumber=scan.nextInt();
		System.out.println("the entered value is "+userInputNumber);
		
		Scanner scan1 = new Scanner(System.in);
		System.out.println("enter some decimal no.:");
		double userInputNumber1=scan1.nextDouble();
		System.out.println("the entered value is "+userInputNumber1);
		
		Scanner scan2 = new Scanner(System.in);
		System.out.println("enter some string:");
		String userInputNumber2=scan2.nextLine();
		System.out.println("the entered string is "+userInputNumber2);
	}

}
