package intor.function;

public class ParameterTest {

	public static void main(String[] args) {
		int i =90;
		change(i);
		System.out.println(i);
		
		
		String s1 = new String ("abc");
		change(s1);
		System.out.println(s1);
		
		char[] c = {'a'};
		change(c);
		System.out.println(c);
		
		Double d = new Double(4.1);
		change(d);
		System.out.println(d);
		
		int [] a = {10,90};
		change(a);
		System.out.println(a[0]);

	}

	private static void change(int[] a) {
		a = new int[2];
		a[0] = 9000;
		
	}

	private static void change(Double d) {
		d += 90;
		
	}

	private static void change(char[] c) {
		c[0] = 'c';
	}

	private static void change(String s1) {
		s1 = "cde";
	}

	public static int change(int ii) {
		ii = ii * 2;
		return ii;
	}

}
