package oo.review;

import java.awt.List;
import java.io.PrintStream;

import oo.review.in.B;
import oo.review.in.D;
import oo.review.interfaze.MyList;

public class OOTest {

	public static void main(String[] args) {
		C o1 = new D();
		
		A a1 = new A(80);
		System.out.println(a1.a);
		A a2 = new A(89);
		System.out.println(a2.a);
		System.out.println(a2.doSomthing(13));
		System.out.println(a1.toString());
		System.out.println(a1.hashCode());
		
		B b1 = new B(98);
		System.out.println(b1.doSomthing(890));
		System.out.println(b1.doSomthingB(890));
		A x1 = new B(6);
		A x = new A();
		
		
		x = b1;
//		b1 = x;
		if (x==b1) {
			System.out.println(x.getClass());
			x.doSomthing(8990);
			((B)x).doSomthingB(8990);
		}
		
		b1.varArgs(54,89.0);
		System.out.println("i=" + 12 + ", f=" + 12.9);
		System.out.printf("i=%d, f=%10."+3+"f\n", 12, 12.9,890);
		System.out.format("i=%d, f=%."+3+"f", 12, 12.9,890);
		
		MyList l = null;
		l.add(123);
		l.remove(40);
		System.out.println(l.size());
		
		
	}

}


