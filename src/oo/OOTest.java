package oo;

import oo.basic.Matrix;

public class OOTest {

	public static void main(String[] args) {
//		String st = new String("abc");
		String st = new String();
		
		Matrix a = new Matrix(2,3);
		System.out.println(a);
//		a.setDim(2,3);
		a.set(0, 1, 15);
		a.print();
		
//		System.exit(0);
		
//		Process p = null;
//		p.exitValue()
//		int k=0;
//		for(int i=0;i<1000000; i++) {
//			for (int j=0; j<1000000; j++) {
//				k += i;
//			}
//		}
//		System.out.println(k);
//		try {
//			Thread.sleep(10000);
//		} catch (InterruptedException e1) {
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//		}
		
		Matrix b = new Matrix(2, 3);
		
//		b.setDim(2, 3);
//		setDim(232,44);
		b.set(0, 2, 5);
//		b.v[0][2] = 5;
//		b.v[0] = new int[0];
		b.print();
		
		Matrix c = a.addTo(b);
	
		c.print();
		
		Matrix d = new Matrix(c);
		Matrix e = c;
		
		OOTest oo = new OOTest();
		

	}

}
