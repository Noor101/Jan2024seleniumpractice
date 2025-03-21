package SeleniumSessions;

public class AlphabetPattern {

	public static void main(String[] args) {
		
		
//		A
//		AB
//		ABC
//		ABCD
//		ABCDE
		
		int a =65;
		for(int i=0; i<=4; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print((char)(a+j));
			}
			System.out.println();
		}
		
		int a1=65;
		for(int i=0; i<5; i++) {
			for (int j=0; j<=i; j++) {
				System.out.print((char)(a1+j));
			}
			System.out.println();

		}

	}

}
