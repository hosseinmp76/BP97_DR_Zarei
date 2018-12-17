package oo.set;

import oo.gui.Point;

public class ListOfPoints {
	private Point[] s = new Point[2];
	int usedCells = 0;

	public void add(Point st) {
		if (s.length>usedCells) {
			s[usedCells] = st;
			usedCells++;
		} else {
			Point[] newArray = new Point[3*s.length/2];
			for(int i=0; i<s.length; i++) {
				newArray[i] = s[i];
			}
			newArray[usedCells] = st;
			s = newArray;
			usedCells++;
		}
	}

	public int size() {
		return usedCells;// s.length;
	}

	public Point get(int index) {
		return s[index];
	}
}
