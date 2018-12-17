package oo.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class CollectionTest {

	public static void main(String[] args) {
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

}
