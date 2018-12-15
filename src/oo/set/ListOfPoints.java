package oo.set;

import oo.gui.Point;

public class ListOfPoints {
	private Point[] s = new Point[0];

	public void add(Point st) {
		Point[] newArray = new Point[s.length+1];
		for(int i=0; i<s.length; i++) {
			newArray[i] = s[i];
		}
		newArray[newArray.length-1] = st;
		s = newArray;
	}

	public int size() {
		return s.length;
	}

	public Point get(int index) {
		return s[index];
	}
}
