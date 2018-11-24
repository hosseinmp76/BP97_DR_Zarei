package oo.basic;

public class Matrix {
	private int[][] v;
	
	private Matrix() {
		System.out.println("Inside Default Constructor");
	}
	
	public Matrix(int rows, int cols) {
		this();
		System.out.println("Inside Constructor");
//		v = new int[rows][cols];
		setDim(rows, cols);
	}
	
	public Matrix(Matrix m) {
//		v = new int[m.getRows()][m.getCols()];
//		this.setDim(m.getRows(), m.getCols());
//		setDim(m.getRows(), m.getCols());
//		int i = 0;
		this(m.getRows(), m.getCols());
		for(int i=0; i<getRows();i++) {
			for (int j=0; j<getCols(); j++) {
				v[i][j] = m.v[i][j];
			}
		}
/*		
		long l = System.currentTimeMillis();
		int s = 0;
		for (int i=0; i<1000000; i++) {
			int j = getRows();
			s += j;
		}
		System.out.println("getrows: " + (System.currentTimeMillis() - l) + "->" + s);
		l = System.currentTimeMillis();
		s = 0;
		for (int i=0; i<1000000; i++) {
			int j = v.length;
			s += j;
		}
		System.out.println("array: " + (System.currentTimeMillis() - l) + "->" + s);
	*/	
	}
	
	
	private int getRows() {
		return v.length;
	}

	private int getCols() {
		return v[0].length;
	}

	public void setDim(int rows, int cols) {
		v = new int[rows][cols];
	}

	/**
	 * 
	 * @param row must start with zero
	 * @param col must start with zero
	 * @param value
	 */
	public void set(int row, int col, int value) {
		v[row][col] = value;
	}
	
	public int get(int row, int col) {
		return v[row][col];
	}
	
	public Matrix addTo(Matrix in) {
		Matrix s = new Matrix();
		s.setDim(in.v.length, in.v[0].length);
		
		for(int i=0; i<v.length;i++) {
			for (int j=0; j<v[i].length; j++) {
				s.v[i][j] = in.v[i][j] + v[i][j];
//				s.set(i, j, in.v[i][j] + v[i][j]);
			}
		}
		return s;
	}

	public void print() {
		for(int i=0; i<v.length;i++) {
			for (int j=0; j<v[i].length; j++) {
				System.out.print(v[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public void a(int i) {
		char v = 'c';
		int k = 0;
		while(i<0) {
			int j = 10;
			System.out.println(j);
			System.out.println(k);
			System.out.println(i);
			System.out.println(this.v[0][0]);
		}
	}

}







