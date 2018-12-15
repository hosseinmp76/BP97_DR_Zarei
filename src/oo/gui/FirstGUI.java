package oo.gui;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.Scanner;

import javax.swing.JFrame;

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
		f.setBounds(100, 150, 200, 300);
		f.setTitle("اولین برنامه گرافیکی من");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		f.setResizable(false);
		f.addWindowListener(new MyWindowListener());
		f.addMouseListener(new MyMouseListener());
		f.show();

	}

}
