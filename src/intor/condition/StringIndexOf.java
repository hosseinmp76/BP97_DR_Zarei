package intor.condition;

import java.util.Scanner;

public class StringIndexOf {

	public static void main(String[] args) {
		System.out.println("Enter Text:");
		Scanner s = new Scanner (System.in);
		String text = s.nextLine();
		System.out.println("Enter Pattern:");
		String pattern = s.nextLine();
		
		System.out.println(text.indexOf(pattern));
		
//		int i = 0;
//		while(i<=text.length()-pattern.length()) {
//			int j = 0;
//			while (j<pattern.length()) {
//				if (pattern.charAt(j)!=text.charAt(i+j))
//					break;
//				else
//					j++;
//			}
//			if (j==pattern.length()) {
//				System.out.println(i);
//				break;
//			} else {
//				i++;
//			}
//		}
//		if (i>text.length()-pattern.length()) {
//			System.out.println(-1);
//		}

		boolean found = true;
		for(int i = 0; i<=text.length()-pattern.length(); i++) {
			found = true;
			for (int j = 0;j<pattern.length();j++) {
				if (pattern.charAt(j)!=text.charAt(i+j))
					found = false;
			}
			if (found) {
				System.out.println(i);
				break;
			}
		}
		if (!found) {
			System.out.println(-1);
		}
		
		System.out.println("Enter a number:");
		text = s.nextLine();
		String reverse = new String("");
		for(int i=text.length()-1;i>=0;i--) {
			reverse = reverse.concat(text.substring(i,i+1));
		}
		System.out.println(reverse);
	}

}
