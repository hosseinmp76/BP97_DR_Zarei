package oo.collection;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

import oo.gui.Point;

public class ComparisonTest {

	public static void main(String[] args) {
		
		File fin = new File("points.dat");
		try {
			ObjectInputStream fos = new ObjectInputStream(new FileInputStream(fin));
			while(true) {
				Point p = (Point) fos.readObject();
				System.out.println(p);
				if (p==null) {
					break;
				}
			}
			fos.close();
		} catch(IOException e) {
//			e.printStackTrace();
		} catch(ClassNotFoundException e) {
		}
		
		
//		String s1 = "aaaz";
//		String s2 = "aaaa";
//		System.out.println(s2.compareTo(s1));
		
		
//		Map<String, Point> m = new TreeMap<String, Point>();
//		m.put("sdfsd", new Point(0, 0));
//		m.put("sd", new Point(0, 0));
//		m.put("z", new Point(0, 0));
//		m.put("a", new Point(0, 0));
////		Set<Entry<String, Point>> x = m.entrySet();
//		for(Entry<String, Point> e: m.entrySet()) {
//			System.out.println(e.getKey() + "->" + e.getValue());
//		}
		
		Map<Point, String> m = new TreeMap<Point, String>();
		m.put(new Point(0, 0), "sdfsd");
		m.put(new Point(10, 0), "dsgfsdfsd");
		m.put(new Point(0, 10), "sdfsfsdfd");
		m.put(new Point(0, 0), "sdfssdfsdfd");
//		Set<Entry<String, Point>> x = m.entrySet();
		
		
		
		File f = new File("points.dat");
		try {
			ObjectOutputStream fos = new ObjectOutputStream(new FileOutputStream(f));
			for(Entry<Point, String> e: m.entrySet()) {
				System.out.println(e.getKey() + "->" + e.getValue());
				fos.writeObject(e.getKey());
			}

			fos.close();
		} catch(IOException e) {
			e.printStackTrace();
		}
	}

}
