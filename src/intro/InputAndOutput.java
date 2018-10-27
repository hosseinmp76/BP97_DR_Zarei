package intro;

import java.util.Scanner;
import java.lang.System;

public class InputAndOutput {
	public static void main(String[] args) {
		System.out.println("Please enter a number: ");

		
		Scanner s = new Scanner(System.in);
		
		System.out.println(2*8748927394872938749l);
		long n = 8374;
		float f1 = 12.0f;
		
		String st0 = s.nextLine();
		System.out.println(st0);
		
		String st1 = s.next();
		System.out.println(st1);

		int i = s.nextInt();
		System.out.println(i);
		
//		String st = s.nextLine();
//		System.out.println(st);
////		int i = s.nextInt();
////		System.out.println(i);
//		double d = s.nextDouble();
//		System.out.println(s);
	}

}
