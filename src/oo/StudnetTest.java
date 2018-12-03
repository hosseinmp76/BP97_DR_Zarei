package oo;

import java.util.Scanner;

import oo.students.SetOfStudent;
import oo.students.Student;

public class StudnetTest {
	static SetOfStudent students = new SetOfStudent();

	public static void main(String[] args) {
//		char i = 'a';
//		switch(i) {
//		case 'a':
//			System.out.println("0");
//		case 'b':
//			System.out.println("1");
//		case 2:
//			System.out.println("2");
//		case 0:
//			System.out.println("3");
//			default :
//				System.out.println("d");
//			case 8:
//				System.out.println("d");
//		}
//		String b = "fdffalse";
//		switch(b) {
//		case "fsdfs":
//		case "gfdgdfg":
//		}
//		long l = 98479287492353l;
//		switch(l) {
//		
//		}
		
		
		
		
		
		
		
		
		/*
		Student st = new Student(97101654, "ali", 1397);
		System.out.println(st.getId());
		Student st2 = new Student(96123123, "hassan", 1396);
		System.out.println(st2.getId());
		
		SetOfStudent students = new SetOfStudent();
		students.add(st);
		students.add(st2);
		
		for(int i=0;i<1000;i++) {
			students.add(new Student(97100*1000+i, "st " + i, 1397));
		}
		
		for(int i=0;i<students.size();i++) {
			System.out.println(students.get(i).getId());
		}
		long id = 97100345;
		for(int i=0;i<students.size();i++) {
			if (students.get(i).getId()==id) {
				System.out.println(students.get(i).getName());
				students.get(i).setName("dfsdf");
			};
		}
		
		students.updateName(id, "taghi");
		
		students.remove(97100345);
		
		*/
		System.out.println("Welcome to the Student Management Application");
		Scanner s = new Scanner(System.in);
		int command = 0;
		asd: while(true) {
			System.out.println("Select command:");
			System.out.println("0 : Print ALL");
			System.out.println("1 : Register New Student");
			System.out.println("2 : Update Student");
			System.out.println("3 : Remove Student");
			System.out.println("4 : Search Student");
			System.out.println("5 : Exit");
			command = s.nextInt();
			switch (command) {
			case 0:
				printAll();break;
			case 1:
				insertNewStudent();break;
			case 2:
				updateStudent();break;
			case 3:
				removeStudent();break;
			case 4:
				searchStudent();break;
			case 5:
				System.out.println("Good Bye");break asd;
			default :
				System.out.println("Invalid Command");
			}
		}

	}

	private static void searchStudent() {
		// TODO Auto-generated method stub
		
	}

	private static void removeStudent() {
		// TODO Auto-generated method stub
		
	}

	private static void updateStudent() {
		// TODO Auto-generated method stub
		
	}

	private static void insertNewStudent() {
		Scanner s = new Scanner(System.in);
		System.out.println("ID:");
		long Id = s.nextLong();
		System.out.println("Name:");
		String name = s.nextLine();
		System.out.println("Year:");
		int y = s.nextInt();
		Student st = new Student(Id, name, y);
		students.add(st);
	}

	private static void printAll() {
		for(int i=0;i<students.size(); i++) {
//			Student st = students.get(i);
//			System.out.println(st.toString());
			System.out.println(students.get(i));
		}
	}

}
