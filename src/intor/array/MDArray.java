package intor.array;

public class MDArray {

	public static void main(String[] args) {
//		long [][] M = new long[10][10];
//		for (int i=0; i<10; i++) {
//			for (int j=0; j<10; j++) {
//				M[i][j] = i*j;
//			}
//		}
//		System.out.println(M[4][6]);

		long [][] M = new long[10][];
		for(int i=0;i<10; i++) {
			M[i] = new long[i+1];
		}
		for (int i=0; i<10; i++) {
			for (int j=0; j<i+1; j++) {
				M[i][j] = i*j;
			}
		}
		System.out.println(M[6][4]);
		
		byte[][][] b = new byte[4][][];
		b[0] = new byte[5][8];
		b[1] = new byte[3][];
		b[1][0] = new byte[9];
		
		b[2] = b[0];
//		b[3] = b[0][1];
//		b[0][1] = b[3];
		int i =90;
		byte p = (byte) i;
		i = p;
		
		int[] A = new int[10];
		byte[] P = new byte[10];
//		A = (int[])P;
//		P = (byte[]A;

/*
 		Object o = P;
		A = (int[]) o;
*/		
		String[] X = new String[90];
		X[0] = "dsfsdf";
		X[1] = new String("dfsdfsdf");
		
	}

}
