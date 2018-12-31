package oo.review;

import oo.review.interfaze.MyList;

public class A extends Object implements MyList{
	public A() {
		System.out.println("Inside A's Cons.");
		a=1;
	}
	public A (int i) {
		this();
//		a = i;
	}
	
	protected final int a;
	
	public int doSomthing(int j) {
//		int c = 90;
//		a++;
		return j+a;
	}
	@Override
	public void add(int i) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public char[] size() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void remove(int i) {
		// TODO Auto-generated method stub
		
	}
}
