package oo;

public class StaticTest {

	public static int j = 890;
	public int i = 90;
	
	public static void main(String[] args) {
		Long l = Long.valueOf("1234");
		Long l2 = Long.MAX_VALUE;
		Long l3 = 909090l;
		System.out.println(StaticTest.j);
		j = 787;
//		System.out.println(i);
		
//		StaticTest.main(null); 
//		StaticTest.f();
//		f();
		g();
		StaticTest.g();
		
		StaticTest s1 = new StaticTest();
		s1.f();
		System.out.println(s1.i);
		System.out.println(s1.j);
		StaticTest.g();
		

		StaticTest s2 = new StaticTest();
		System.out.println(s2.i);
		System.out.println(s2.j);
	}
	
	public static void g() {
//		i++;
		System.out.println("inside g");
		StaticTest t = new StaticTest();
		t.f();
	}
	public void f() {
		i = 800;
		g();
	}

}
