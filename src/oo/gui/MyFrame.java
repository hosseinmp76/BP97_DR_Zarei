package oo.gui;

import java.awt.Color;
import java.awt.Graphics;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

import javax.swing.JFrame;

import oo.set.ListOfPoints;

public class MyFrame extends JFrame {
//	ListOfPoints circles = new ListOfPoints();
	LinkedList<Point> circles = new LinkedList();
	
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
		
		for(int i=0; i<circles.size(); i++) {
			Point p = (Point) circles.get(i);
			g.drawOval(p.x-10, p.y-10, 20, 20);
		}
//		System.out.println("inside paint");
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
}
