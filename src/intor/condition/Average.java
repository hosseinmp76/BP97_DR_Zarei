package intor.condition;

public class Average {

	public static void main(String[] args) {
		int a = 1000;
		int sum = 0;
//		for (int i =1; i<=a; sum+=i++); 
////			sum+=i;
		int i = 0;
		do {
			sum += i;
			i++;
		} while(i<=a);
		
		System.out.println(sum/a);

	}

}
