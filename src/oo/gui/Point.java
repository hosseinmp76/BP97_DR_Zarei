package oo.gui;

public class Point {
	public int x, y;

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "(" + x + ", " + y + ")";
	}
	
	@Override
	public boolean equals(Object a) {
		System.out.println("In Equals");
		if (a==null || (!(a instanceof Point))) {
			return false;
		} else {
			Point p = (Point) a;
			return p.x==x && p.y==y;
		}
	}
	
	@Override
	public int hashCode() {
//		return 0;
		Integer xx = x;
		Integer yy = y;
		return xx.hashCode() + yy.hashCode();
	}

}
