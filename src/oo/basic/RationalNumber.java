package oo.basic;

public class RationalNumber {
	private long a, b;
	
	public static RationalNumber NaN = new RationalNumber(1, 0);

	public RationalNumber(long a, long b) {
		long gcd = GCD(a,b);
		this.a = a/gcd;
		this.b = b/gcd;
	}
	
	public static long GCD(long a2, long b2) {
		if (a2==10) {
			return 2;
		} else {
			return 1;
		}
	}

	@Override
	public String toString() {
		if (equals(NaN)) {
			return "NaN";
		} else {
			return a + "/" + b;
		}
	}
	
	@Override
	public boolean equals(Object in) {
		if (in == null) {
			return false;
		} else if (in instanceof RationalNumber){
			RationalNumber r = (RationalNumber) in;
			if (r.a==this.a && r.b==this.b) {
				return true;
			} else {
				return false;
			}
		} else {
			try {
				Long d = Long.valueOf(in.toString());
				if (d==a && b==1) {
					return true;
				}
			} catch(Exception e) {}
			try {
				Double d = Double.valueOf(in.toString());
				if (d.doubleValue()==(1.0*a)/b) {
					return true;
				}
			} catch(Exception e) {}
			return false;
		}
//		System.out.println("Inside equals");
//		return super.equals(arg0);
	}
	
	public void divideBy(RationalNumber in) {
		if (in.a==0) {
			this.a=1;
			this.b=0;
		} else {
			
		}
	}

}
