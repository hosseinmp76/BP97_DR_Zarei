package oo.review.in;

import oo.review.A;
import oo.review.interfaze.MyList2;

public class B extends A implements MyList2 {
	B () {
		super(76);
		System.out.println("Inside B's Cons.");
		doSomthing(90);
		doSomthingB(90);
		b = a*a;
	}
	
	public B(int k) {
		super();
	}
	
	int b = 80;
	
	@Override
	public int doSomthing(int k) {
		return a + b;
	}
	
	public int doSomthingB(int k) {
		return k + a + b;
	}
	
	public void varArgs(Object... v) {
		
	}


	@Override
	public char[] size() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void x() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void remove(int i) {
		// TODO Auto-generated method stub
		
	}
	
}