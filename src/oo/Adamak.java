package oo;

import java.awt.Graphics;

public abstract class Adamak extends Object implements Drawable {
	int x , y;

	public Adamak(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public void draw(Graphics g) {
		g.drawOval(x-10, y-10, 20, 20);
		g.drawLine(x, y+10, x, y+30);
	}

}
