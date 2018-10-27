package intor.condition;

import java.util.Scanner;

public class SumOfDigits {

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
		int s = 0;
		while(l!=0) {
			s = (int)(l%10) + s;
			l = l/10;
		}
		System.out.println("sum of digits is " + s);

	}

}
