package intor.condition;

public class HamingDistance {

	public static void main(String[] args) {
		long l = System.currentTimeMillis();
		int a=15, b =0;
		int d = 0;
//		for (int i=0; i<32; i++) {
//			if((a&1)!=(b&1)) {
//				d++;
//			}
//			a>>=1;
//			b>>=1;
//		}
		int i=0;
		if (i<32) {
			do {
				if((a&1)!=(b&1)) {
					d++;
				}
				a>>=1;
		b>>=1;
		i++;
			} while(i<32);
		}
		System.out.println(d);
		System.out.println(System.currentTimeMillis()-l);
		
		
		

	}

}
