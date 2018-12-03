package oo.students;

public class SetOfStudent {
	private Student[] s = new Student[0];

	public void add(Student st) {
		Student[] newArray = new Student[s.length+1];
		for(int i=0; i<s.length; i++) {
			newArray[i] = s[i];
		}
		newArray[newArray.length-1] = st;
		s = newArray;
		
//		System.gc();
	}

	public int size() {
		return s.length;
	}

	public Student get(int index) {
		return s[index];
	}

	public void remove(long id) {
		int index = find(id);
		if (index>=0) {
			Student[] newArray = new Student[s.length-1];
			for(int i=0; i<index; i++) {
				newArray[i] = s[i];
			}
			for(int i=index+1; i<s.length; i++) {
				newArray[i-1] = s[i];
			}
			s = newArray;
		}
	}

	public void updateName(long id, String newName) {
		int index = find(id);
		if (index>=0) {
			s[index].setName(newName);
		}
		
	}

	/**
	 * 
	 * @param id
	 * @return index of the student with id, -1 otherwise
	 */
	private int find(long id) {
		for(int i=0; i<size(); i++) {
			if (get(i).getId()==id) {
				return i;
			}
		}
		return -1;
	}

}
