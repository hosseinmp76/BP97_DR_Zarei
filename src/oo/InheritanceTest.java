package oo;

import java.io.PrintStream;
import java.util.AbstractCollection;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class InheritanceTest {

	public static void main(String[] args) {
		Class c = ArrayList.class;
		do {
			System.out.println(c);
			c = c.getSuperclass();
		} while( c!=null);
		
		
		Iterable l = new ArrayList();
	}

}
