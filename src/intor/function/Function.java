package intor.function;

public class Function {

	public static void main(String[] args) {
		String st = "fsdf";
		int i = st.length();
		String s = st.substring(2, 3);
		int[][] b = {{45},{34,68},null,null};
		int [] a = {10,90,80};//new int[3]; [0]=10,[1]=90,[2]=80
		
		int ii  = Integer.valueOf("678");
		Function.printArray(a);
		int min = Function.findMin(a);
		System.out.println(min);
	}
	public static void printArray(int[] x) {
		for (int i=0; i<x.length; i++) {
			System.out.println(x[i]);
		}
	}
	public static int findMin(int[] y) {
		int m = y[0];
		for (int i=1; i<y.length; i++) {
			if (y[i]<m) {
				m = y[i];
			}
		}
		return m;
	}
	

}
