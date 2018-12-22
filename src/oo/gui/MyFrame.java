package oo.gui;

import java.awt.Color;
import java.awt.Graphics;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import javax.swing.JFrame;

import oo.Drawable;
import oo.set.ListOfPoints;

public class MyFrame extends JFrame {
//	ListOfPoints circles = new ListOfPoints();
	ArrayList<Point> circles = new ArrayList();
	List d = new ArrayList();
	
	String fileName;
	public MyFrame(String fileName) {
		this.fileName = fileName;
		try {
			Scanner s = new Scanner(new File(fileName));
			while(s.hasNext()) {
				int x = s.nextInt();
				int y = s.nextInt();
				circles.add(new Point(x, y));
			}
			s.close();
		} catch(Exception e) {e.printStackTrace();}
		
	}

	@Override
	public void paint(Graphics g) {
		super.paint(g);
		g.setColor(Color.red);
		g.drawRect(20, 50, 100, 200);
		g.setColor(Color.blue);
		g.drawOval(20, 50, 100, 200);
		
		for(int i=0; i<circles.size() && i<500; i++) {
			Point p = (Point) circles.get(i);
			g.drawOval(p.x-10, p.y-10, 20, 20);
		}
//		System.out.println("inside paint");
		
		for(int i=0;i<d.size();i++) {
			((Drawable)(d.get(i))).draw(g);
		}
	}

	public void addCircle(int x, int y) {
		circles.add(new Point(x, y));
		try {
			PrintWriter s = new PrintWriter(new File(fileName));
//			PrintStream t = new PrintStream(new File(fileName));
			for(int i=0; i<circles.size(); i++) {
				Point p = (Point) circles.get(i);
//				s.append(p.x + " " + p.y + "\n");
				s.println(p.x + " " + p.y);
			}
			s.close();
		}catch(Exception e) {e.printStackTrace();}
		repaint();
	}
	
	public void addCircleNoPaint(int x, int y) {
		circles.add(new Point(x, y));
	}
	
	public void addDrawable(Drawable o) {
		d.add(o);
	}
	
}
