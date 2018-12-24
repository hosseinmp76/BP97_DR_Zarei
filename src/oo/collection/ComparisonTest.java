package oo.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

import oo.gui.Point;

public class ComparisonTest {

	public static void main(String[] args) {
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
		for(Entry<Point, String> e: m.entrySet()) {
			System.out.println(e.getKey() + "->" + e.getValue());
		}

	}

}
