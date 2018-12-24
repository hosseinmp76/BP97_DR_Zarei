package oo.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Vector;

import oo.gui.Point;

public class CollectionTest {

	public static void main(String[] args) {
		testMap();
		System.exit(0);
		
		testSet();
		System.exit(0);
		
		
		List l = new LinkedList();
		long t = System.currentTimeMillis();
		for (int i=0; i<1000000; i++) {
			l.add(i);
		}
		System.out.println("Adding Running time(ms): " + (System.currentTimeMillis()-t));
		System.out.println(l.size());
		long s = 0;
		for (int i=0;i<l.size();i++) {
			s+= (Integer)l.get(i);
		}
//		for (Object o: l) {
//			s+= (Integer)o;
//		}
		for(Iterator i = l.iterator(); i.hasNext();) {
			s+= (Integer)i.next();
		}
		System.out.println(s);
		System.out.println("Itarating Running time(ms): " + (System.currentTimeMillis()-t));
		while(l.size()>0) {
			l.remove(l.size()/2);
		}

		
		System.out.println("Total Running time(ms): " + (System.currentTimeMillis()-t));
		
		int[] xx = new int[] {232,2323,323};
		for(int x:xx) {
			System.out.println(x);
		}
		
		
		List l2 = new LinkedList();
		l2.add("dsds");
		Iterator ii = l2.iterator();
		if(ii.hasNext()) {
			System.out.println(ii.next());
		}
		if(ii.hasNext()) {
			System.out.println(ii.next());
		}
		
		
	}

	private static void testMap() {
//		Object o = new String("gdfgdf");
//		Object o2 = new String("gdfgdy");
//		if (o.equals(o2)) {
//			System.out.println("GOOD");
//		}
//		
//		Point p1 = new Point(10,100);
//		Point p2 = new Point(10,100);
//		if (!p1.equals(p2)) {
//			System.out.println("BAD");
//		}
//		System.out.println(p1.hashCode());
//		System.out.println(p2.hashCode());
//		System.out.println(o.hashCode());
//		System.out.println(o2.hashCode());
		
		
		Map m = new HashMap();
		m.put(13, "dfsada");
		m.put(15, "dfsdf");
		m.put(50, new Point(100,321));
		System.out.println(m);
//		System.exit(0);
		for(int i =0; i<1000000; i++) {
			m.put(i, new Point(i%100,i%321));
		}
		
		Set keys = m.keySet();
		for (Object o: keys) {
//			System.out.println(m.get(o));
		}
		
//		for(Iterator i= keys.iterator(); i.hasNext();) {
//			System.out.println(m.get(i.next()));
//		}

		for(int i =0; i<1000000+10; i++) {
//			System.out.println(m.get(i));
		}
		
		for(int i =0; i<1000000; i++) {
			if (!m.containsValue(new Point(i%100,i%321))) {
				m.put(i, new Point(i%100,i%321));
			}
		}
		m.remove(1234);
		keys.remove(10234);
		System.out.println(keys.size());
		System.out.println(m.size());
		Collection v = m.values();
		
		{
			List<Integer> l = new ArrayList<Integer>();
			l.add(768);
//			l.add("dsfgdfs");
//			l.add(new Point(0, 0));
//			Scanner s = (Scanner) l.get(0);
			Map<Integer, Point> m2 = new HashMap<Integer, Point>();
			m2.put(53453, new Point(0,0));
		}
		
		
		for(Object o: m.entrySet()) {
			Entry<Integer, Point> e = (Entry) o;
//		for(Entry e: (Set<Entry>)m.entrySet()) {
//			System.out.println(e.getKey() + "->" + e.getValue().x);
		}
		
		m.clear();
		System.out.println(m.size());
		
		m.put(57634527L, "sdfgsdf");
		String st = (String) m.get(57634527L);
		System.out.println(st);
	}

	private static void testSet() {
		Set l = new TreeSet();
		long t = System.currentTimeMillis();
		for (int i=0; i<1000000; i++) {
			l.add(i);
		}
		for (int i=0; i<1000000; i++) {
			l.add(i);
		}
		System.out.println("Adding Running time(ms): " + (System.currentTimeMillis()-t));
		System.out.println(l.size());
		long s = 0;
//		for (Object o: l) {
//			s+= (Integer)o;
//		}
		for(Iterator i = l.iterator(); i.hasNext();) {
			int x = (Integer)i.next();
//			System.out.println(x);
			s+= x;
		}
		System.out.println(s);
		System.out.println("Itarating Running time(ms): " + (System.currentTimeMillis()-t));
		while(l.size()>0) {
			l.remove(l.size()/2);
		}
		System.out.println("Total Running time(ms): " + (System.currentTimeMillis()-t));
	}

}
