package intor.condition;

public class Prime {

	public static void main(String[] args) {
//		int a = 8, b = 12;
//		int i = 2;
//		while (i<=a)
//			if(a%i==0 && b%i==0) {
//				System.out.println("Not Prime");
//				break;
//			} else 
//				++i;//i=i+1;//i+=1;
//		if (i>a) {
//			System.out.println("Prime");
//		}

//		int a = 2, b = 12;
//		int i = 2;
//		while (i++<=a) {
//			System.out.println(i);
//			if(a%(i-1)==0 && b%(i-1)==0) {
//				System.out.println("Not Prime");
//				break;
//			}
//		}
//		if (i>a) {
//			System.out.println("Prime");
//		}
		
		int a = 25, b = 12;
		int i;
		for (i = 2; i<=a; ++i) {
			if(a%i==0 && b%i==0) {
				System.out.println("Not Prime");
				break;
			}
		}
		if (i>a) {
			System.out.println("Prime");
		}
	}

}
