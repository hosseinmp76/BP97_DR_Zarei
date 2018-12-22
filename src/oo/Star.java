package oo;

import java.awt.Graphics;

import oo.gui.Point;

public class Star implements Drawable {
	Point[] vertices;
	

	public Star(Point[] vertices) {
		super();
		this.vertices = vertices;
	}


	@Override
	public void draw(Graphics g) {
		int[] x = new int[vertices.length];
		int[] y= new int[vertices.length];
		
		for (int i=0; i<vertices.length; i++) {
			x[i] = vertices[i].x;
			y[i] = vertices[i].y;
		}
		
		g.drawPolygon(x, y, vertices.length);
	}


	@Override
	public void draw() {
		// TODO Auto-generated method stub
		
	}

}
