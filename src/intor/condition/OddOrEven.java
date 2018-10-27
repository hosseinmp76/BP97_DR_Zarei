package intor.condition;

import java.util.Scanner;

public class OddOrEven {

	public static void main(String[] args) {
		System.out.println("Please enter an integer number:");
		Scanner scanner = new Scanner(System.in);
		long l = 0;
		boolean f = true;
		while (true) {
			try {
				l = scanner.nextLong();
				if (l>=0) {
					break;
				}
			}catch(Exception e) {
				System.out.println(e);
				String st = scanner.nextLine();
				System.out.println(st);
				System.out.println(l);
				System.out.println("You are supposed to enter a number, but what you entered is not an integer number!");
				System.out.println("Please enter an integer number:");
			}
		}
//		if (l%2==0) {
//			//e v e n 
//			System.out.println(l + " is even");
//		}
//		if (l%2!=0) {
//			//odd
//			System.out.println(l + " is odd");
//		}
		
//		if (l%2==0) {
//			//e v e n 
//			System.out.println(l + " is even");
//		} else {
//			//odd
//			System.out.println(l + " is odd");
//		}
		
		if (l%2==0)
		System.out.println(l + " is even");
		else
		System.out.println(l + " is odd");
		scanner.close();
		System.out.println(scanner);
	}

}
