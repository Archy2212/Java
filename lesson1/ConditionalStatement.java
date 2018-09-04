package lesson1;

import java.util.Scanner;

public class ConditionalStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a no.:");
		int x = scan.nextInt();
		
		if(x%2==0){
			System.out.println("even no.");
		}
		else{
			System.out.println("odd no.");
		}
	}

}
