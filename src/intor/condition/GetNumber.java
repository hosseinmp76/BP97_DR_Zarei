package intor.condition;

import java.util.Scanner;

public class GetNumber {

	public static void main(String[] args) {
		System.out.println("Please enter a number");
		Scanner s = new Scanner(System.in);
		long l;
		do {
			try {
				l = s.nextLong();
				break;
			}catch(Exception e) {
				s.nextLine();
				System.out.println("Enter an integer!");
			}
		}while(true);
		System.out.println("You entered " + l);

	}

}
