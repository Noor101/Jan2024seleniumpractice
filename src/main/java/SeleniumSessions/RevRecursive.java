package SeleniumSessions;

public class RevRecursive {

	public static void main(String[] args) {

		//12345 - 54321
		
		int num = 12345;
		int rev = 0;
		while(num!=0) {
			
			rev =  rev*10+ num%10;
			num = num/10;
		}
		
		System.out.println(rev);
		revRecursive(34);
		revRecursive(3);

		
	}
	
	public static void revRecursive(int num) {
		
		if(num<10) {
			System.out.println(num);
			return;
			
		}else {
			System.out.print(num%10);
			revRecursive(num/10);
		}
	}

}
