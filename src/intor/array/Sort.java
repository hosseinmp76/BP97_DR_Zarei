package intor.array;

import java.util.Random;
import java.util.Scanner;

public class Sort {

	public static void main(String[] args) {
		int [] A;
		A = new int[200];
		boolean[] B = new boolean[9];
		A[0] = 90;
		B[8] = false;
		System.out.println(B.length);
		System.out.println(A.length);
		Random r = new Random();
		for(int i=0; i<20; i++) {
			A[i] = 20 + r.nextInt(800);
		}
		
		for(int i=0; i<20; i++) {
			System.out.println(A[i]);
		}
		
//		for(int i=0;i<20;i++) {
//			for (int j=i+1;j<20;j++) {
//				if (A[i]>A[j]) {
//					int temp = A[i];
//					A[i] = A[j];
//					A[j] = temp;
//				}
//			}
//		}
		byte b = (byte)A[9];
		for(int i=0;i<20;i++) {
			int j=i+1;
			while(j<20) {
				if (A[i]>A[j]) {
					int temp = A[i];
					A[i] = A[j];
					A[j] = temp;
				}
				j++;
			}
		}
		for(int i=0; i<20; i++) {
			System.out.println(A[i]);
		}
		Object c = r;
		if (c instanceof Scanner) {
			System.out.println("c is Scanner");
		}
		if (c instanceof Random) {
			System.out.println("c is Random");
		}
		
		
		

	}

}
