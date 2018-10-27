package intro;

public class VariableAndOperator {

	public static void main(String[] a) {
		boolean b1 = true, b2 = false;
		System.out.println(b1&&b2);
		b2 = b1||b2;
		System.out.println(b2);
		b2 = !b2;
		System.out.println(b2);
		
		b1 = 12==89;
		b2 = 67!=89;
		
		String st = null;
		boolean stl =  st!=null && st.length()==4;
		System.out.println(stl);
		
		
		int i = 17/3;
		System.out.println(i);
		System.out.println(12 % 2.1);
		
		byte b11=20,b21=80;
		System.out.println(b11*b21);
		int i1 = 600000000;
		int i2=9000000;
		long ln = i1*i2;
		System.out.println(ln);
		System.out.println(i1*1l*i2);
		
		String s1,s2;
		s1 = new String("ABC");
		s2 = s1.substring(0,2);
		System.out.println(s2);
		
		double d = 907868768;
		System.out.println(d);
		float f1 = (float)d;
		System.out.println(f1);
		char c = 'a';
		int ci = c ; 
		byte bb = (byte) c;
		short ss = (short)c;
		System.out.println(ci);
		System.out.println(ss);
		System.out.println(bb);
		
		
		byte _r;
		_r = 127;
		byte a1 = -43;
		a1 = -128;
		System.out.println(a1);
		System.out.println(a1);
		short a2 = 1234;
		int a3 = 876837453;
		long a4 = -783658736458543534l;
		a3 = (int)-783658736458543534l;
		a3 = 0;
		a2 = (short)a3;
		
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);
		System.out.println(a4);

	}

}
