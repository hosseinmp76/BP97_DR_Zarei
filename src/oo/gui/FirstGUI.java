package oo.gui;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.Scanner;

import javax.swing.JFrame;

import oo.Adamak;
import oo.Adamak2;
import oo.Star;

public class FirstGUI {

	public static void main(String[] args) {
		Class c = PrintStream.class;
		do {
			System.out.println(c);
			c = c.getSuperclass();
		} while( c!=null);
		
		c = PrintWriter.class;
		do {
			System.out.println(c);
			c = c.getSuperclass();
		} while( c!=null);
		c = Scanner.class;
		do {
			System.out.println(c);
			c = c.getSuperclass();
		} while( c!=null);
		
		///
		
		
		
//		JFrame f = new JFrame();
		MyFrame f = new MyFrame("points.txt");
		
		f.addDrawable(new Adamak2(100,80));
		Point[] x = new Point[] {new Point(20,100), new Point(50,60), new Point(70,90), new Point(60, 100)};
		f.addDrawable(new Star(x));
		
		f.setBounds(100, 150, 200, 300);
		f.setTitle("اولین برنامه گرافیکی من");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setLocationRelativeTo(null);
//		f.setResizable(false);
		f.addWindowListener(new MyWindowListener());
		f.addMouseListener(new MyMouseListener());
		long t = System.currentTimeMillis();
//		for (int i=0; i<1000000; i++) {
//			f.addCircleNoPaint(i%100, i*2%200);
//		}
		System.out.println(System.currentTimeMillis()-t);
		f.show();

	}

}
