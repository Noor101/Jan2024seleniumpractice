package SeleniumSessions;

public class ReverseInt {

	public static void main(String[] args) {
		
		int num = 12345;
		//o/p should be 54321
		
		int rev = 0;
		
		while(num!=0) {
			rev = rev*10+num%10;
			num = num/10;
			
		}	
		System.out.println(rev);	
		
		StringBuffer sr = new StringBuffer(String.valueOf(num));
		System.out.println(sr.reverse());
		
		int number = 34567;
		int rev1 = 0;
		
		while(number!=0) {
			rev1 = rev1*10+number%10;
			number = number/10;
		}
	
		System.out.println(rev1);
	}	

}
