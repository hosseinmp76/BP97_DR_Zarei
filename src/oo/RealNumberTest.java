package oo;

import oo.basic.RationalNumber;

public class RealNumberTest {

	public static void main(String[] args) {
//		Double d = new Double(999999999999999999l);
//		if (d.longValue()==999999999999999999l) {
//			System.out.println("EQUAL");
//		} else {
//			System.out.println("!EQUAL");
//		}
//		System.out.println(RationalNumber.GCD(10, 2));
//		double r1 = 1.0/76587364853879797L;
//		System.out.println(r1);
//		double r2 = 1.0/76587364853879798L;
//		System.out.println(r2);
//		if (r1==r2) {
//			System.out.println("BAD ");
//		}

		RationalNumber r1 = new RationalNumber(1,76587364853879797L);
		String st = r1.toString();
		System.out.println(r1);
		System.out.println(st);
		RationalNumber r2 = new RationalNumber(1,76587364853879797L);
//		r2 = r1;
		if (r1.equals(r2)) {
			System.out.println("EQUAL");			
		} else {
			System.out.println("!EQUAL");
		}
		RationalNumber r3 = new RationalNumber(1, 4);
//		Long.valueOf("" + (1.0/4));
		if (r3.equals(1.0/4)) {
			System.out.println("EQUAL");
		} else {
			System.out.println("!EQUAL");
		}
		
		RationalNumber r4 = new RationalNumber(10, 2);
		if (r4.equals(5)) {
			System.out.println("EQUAL");
		} else {
			System.out.println("!EQUAL");
		}
		
//		RationalNumber r4 = new RationalNumber(10, 2);
		if (r4.equals("5")) {
			System.out.println("EQUAL");
		} else {
			System.out.println("!EQUAL");
		}
		char [] a = {'d'};
		if (r4.equals(a)) {
			System.out.println("EQUAL");
		} else {
			System.out.println("!EQUAL");
		}
		RationalNumber r5 = new RationalNumber(0, 1);
		r1.divideBy(r5);
		
		System.out.println(r1);
		if (r1.equals(RationalNumber.NaN)) {
			System.out.println("r1 is NAN");
		}
		
		Double n = Double.NaN;
		System.out.println(n*67);
		n = n*67;
		if (n.equals(Double.NaN)) {
			System.out.println("TRUE");
		}
		
		
		
	}

}
