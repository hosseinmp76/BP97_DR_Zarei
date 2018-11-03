package intro.wrapper;

import java.util.Random;
import java.util.Scanner;

public class WrapperTest {

	public static void main(String[] args) {
		byte b = 90;
		Byte b2 = new Byte(b);
		String st = "fdfsdf sd";
		st = new String("jhsdfjkshdf ");
		b2 = 87;
		Random r = new Random();
		Object o = new Scanner(System.in);
		String ss = o.toString();
		System.out.println(o.getClass());
		int i = ((Scanner)o).nextInt();
//		Random r2 = (Random)b2;
//		Object o2 = b2;
//		Random r2 = (Random) o2;
		
		
		System.out.println(r);
		System.out.println(o);
		int a1=2,a2=4,a3=5,a4=8,a5=7,a6=8,a7=90,a8=2;
		boolean result = a1--*a2/a3%a4>(a5|a6)==false&&a1!=a8;
		System.out.println(result);
		int a = 7;
		int k = (a++) + (++a);
		System.out.println(k);
		System.out.println(a);

	}

}
