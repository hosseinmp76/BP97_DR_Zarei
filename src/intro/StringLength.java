package intro;

import java.util.Scanner;

public class StringLength {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("لطفا یک رشته حرفی وارد کنید:");
		String st = s.nextLine();
		System.out.println(st.length()==4);

		int i = st.length();
		System.out.print("طول رشته وارد شده برابر با ");
		System.out.print(i);
		System.out.println(" است");
		System.out.println("طول رشته وارد شده برابر با " + i + " است");
		int j = 90;
		System.out.println(i+ "" + j);
		
		if (i==4) {
			System.out.println("طول رشته وارد شده چهار است");
		}
		if (i!=4) {
			if (i>4) {
				System.out.println("طول رشته وارد شده بیشتر از 4 است");
			}
			if (i<4) {
				System.out.println("طول رشته وارد شده کوچکتر از 4 است");
			}
		}

	}

}
