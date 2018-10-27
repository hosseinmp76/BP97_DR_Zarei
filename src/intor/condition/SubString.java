package intor.condition;

public class SubString {

	public static void main(String[] args) {
		String s = "jksahkjahskjdhkasd";
		char c = s.charAt(4);
		System.out.println(c);
		System.out.println(s.length());
		for(int i = 0; i<s.length(); i++) {
			System.out.println(s.charAt(i));
		}
		String s1 = "abc", s2 ="hjashdkjhskdjabcfsdf";
		//TODO
		System.out.println(s2.indexOf(s1));
		
	}

}
