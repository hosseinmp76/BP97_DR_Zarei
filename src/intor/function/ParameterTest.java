package intor.function;

import java.util.Scanner;

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
//		((12+"")+14.6)
//		System.out.print(12+14);
//		try {
//		char [] cc = reverse();
//		System.out.println(cc);
//		} catch(Exception e) {
//			e.printStackTrace();
//		}
		System.out.println("Please \nenter a line");
		String st = nextLine();
		System.out.println(st);
		String ss = "\n";
		String sss = "\r";
		System.out.println((byte)ss.charAt(0));
		System.out.println((byte)sss.charAt(0));
		
		int a1 = 90, b1 = 8787, c1 = 45, d1=8;
		int mmm = min();
		int minAB = min(a1,b1);
		System.out.println(a1);
		int minAC = min(a1,b1,c1);
		int min = min(a1,b1,c1, d1);
		int[] x = new int[] {2342,3423,423,5};
		int mmmn = min(x);
		System.out.println(x[0]);
		int[] s = null;
		s = new int[0];
		
		int mmmm = mul(3,5);
		System.out.println("3*5=" + mmmm);

	}
	private static int mul(int a, int b) {
		if (a<0) {
			return -mul(-a,b);
		} else if (a==0) {
			return 0;
		} else {
			return b + mul(a-1,b);
		}
	}
	//	private static int min(int[] s) {
//		System.out.println(s);
//		if (s!=null && s.length>0) {
//			int min = s[0];
//			for(int i=1;i<s.length; i++) {
//				if (s[i]<min) {
//					min = s[i];
//				}
//			}
//			return min;
//		}
//		return 0;
//	}
	private static int min(int... s) {
//		main(null);
//		String nnn = nextLine();
		System.out.println(s);
		if (s!=null && s.length>0) {
			int min = s[0];
			for(int i=1;i<s.length; i++) {
				if (s[i]<min) {
					min = s[i];
				}
			}
			s[0] = 98989;
			return min;
		}
		return 0;
	}

//	private static int min(int a1, int b1) {
//		// TODO Auto-generated method stub
//		return 0;
//	}
//
//	private static int min(int a1, int b1, int c) {
//		// TODO Auto-generated method stub
//		return 0;
//	}
//
//	private static int min(int a1, int b1, int c1, int d1) {
//		// TODO Auto-generated method stub
//		return 0;
//	}

	public static String nextLine() {
		try {
			String st = "";
			int r = 0;
			do {
				byte[] b = new byte[10];
				r = System.in.read(b);
				for (int i=0;i<r; i++) { 
					System.out.println(b[i]);
					st += (char) b[i];
				}
			}while(r==10);
			return st;
		} catch(Exception e) {
			return null;
		}
	}
	
	private static char[] reverse() throws Exception{
		byte[] b = new byte[10];
		int r = System.in.read(b);
		char[] x = new char[r];
		for (int i=0;i<r; i++) { 
			x[i] = (char) b[i];
		}
		char[] res = new char[x.length];
		int j = 0;
		for (int i=x.length-1;i>=0;i--, j++) {
			res[j] = x[i];
		}
		return res;
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
