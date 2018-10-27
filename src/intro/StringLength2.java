package intro;

import java.util.Scanner;

public class StringLength2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("لطفا یک رشته حرفی وارد کنید:");
		String st = s.nextLine();
		int i = st.length();
		while(i!=4) {
			System.out.println("لطفا یک رشته حرفی با طول چهار وارد کنید:");
			st = s.nextLine();
			i = st.length();
		}
	}

}
