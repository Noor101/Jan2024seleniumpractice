package SeleniumSessions;

public class Palindrome {

	public static void main(String[] args) {
		
		isPalindrome(151);
		isPalindrome(42342344);

	}
	
	public static void isPalindrome(int num) {
		
		//151 353
		
		int r = 0;
		int sum = 0;
		int t;
		
		t=num;
		
		while(num>0) {
			r = num%10;
			sum = (sum*10)+r;
			num = num/10;
		}
		if(t==sum) {
			System.out.println("palindrome number");
		}else {
			System.out.println("Not a palindrome number");
		}
}
		
	}

