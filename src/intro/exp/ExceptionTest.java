package intro.exp;

import java.util.Scanner;

public class ExceptionTest {

	public static void main(String[] args) {
		try {
			Scanner s = new Scanner(System.in);
			int i = s.nextInt();
			System.out.println(i);
		}catch(Exception d) {
			d.printStackTrace();
			System.out.println("خطای ناشناخته !" + d.getMessage());
		}

	}

}
