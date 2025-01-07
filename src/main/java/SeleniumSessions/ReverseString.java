package SeleniumSessions;

public class ReverseString {

	public static void main(String[] args) {
		
		String s = "Selenium";
		String rev = "";
		
		int len = s.length();
		System.out.println(len);
		
		for(int i=len-1; i>=0; i--) {
			rev = rev+s.charAt(i);
		}
		System.out.println(rev);
		
		StringBuffer buffer = new StringBuffer(s);
		System.out.println(buffer.reverse());

	}	
}
