package intor.function;

import static java.lang.Integer.valueOf;

import java.util.Scanner;

import intor.function.Function;

public class Matrix {

	public static void main(String[] args) {
		int[][] M = readMatrix(2, 3);
		System.out.println(M);
		int[][] T = Matrix.readMatrix(2, 3);
		printMatrix(T);
		int[][] S = add(M, T);
		printMatrix(S);
		
		addTo(M, T);//m.addTo(T)
		printMatrix(M);
		
//		int k = valueOf("100");
//		Function.findMin(null);

	}
	
	public static int[][] readMatrix(int rows, int cols) {
		int[][] r = new int[rows][cols];
		Scanner s = new Scanner(System.in);
		System.out.println("Enter matrix entries row by row");
		for(int i=0; i<rows; i++) {
			for (int j = 0; j<cols; j++) {
				r[i][j] = s.nextInt();
			}
		}
		return r;
	}
	
	public static void printMatrix(int[][] m) {
		for(int i=0; i<m.length; i++) {
			for (int j=0; j<m[i].length; j++) {
				System.out.print(m[i][j] + " ");
			}
			System.out.println();
		}
		
	}
	
	public static int[][] add(int[][] m1, int[][] m2) {
		int[][] r = new int[m1.length][m1[0].length];
		for(int i=0; i<m1.length; i++) {
			for (int j = 0; j<m1[i].length; j++) {
				r[i][j] = m1[i][j] + m2[i][j];
			}
		}
		return r;
	}
	
	public static void addTo(int[][] m1, int[][] m2) {
		for(int i=0; i<m1.length; i++) {
			for (int j = 0; j<m1[i].length; j++) {
				m1[i][j] = m1[i][j] + m2[i][j];
			}
		}
	}

}
