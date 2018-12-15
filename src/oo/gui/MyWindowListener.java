package oo.gui;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MyWindowListener extends WindowAdapter {

	@Override
	public void windowClosing(WindowEvent a) {
//		super.windowClosing(arg0);
//		System.out.println("windowClosing");
	}
}

class MyMouseListener extends MouseAdapter {
	@Override
	public void mouseClicked(MouseEvent arg0) {
		super.mouseClicked(arg0);
		System.out.println(arg0.getX() + "-" + arg0.getY());
		((MyFrame) arg0.getSource()).addCircle(arg0.getX(), arg0.getY());
	}
}