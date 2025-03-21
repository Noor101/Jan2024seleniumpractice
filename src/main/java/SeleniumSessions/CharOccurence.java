package SeleniumSessions;

public class CharOccurence {

	public static void main(String[] args) {

		String s = "testing"; // t =2 to find the occurrence of the character\
		
		charOccur("testing is an art", 't');
		charOccurLen("Johnny Johnny yes papa", 'J');

	}
	
	//1 using charArray - for loops
	
	public static void charOccur(String str, char val) {
		int count  = 0;
		for(char ch : str.toCharArray()) {
			if(ch == val) {
				count++;
			}
		}
		System.out.println(val + " : " + count);
	}
	
	
	//2. using length
	
	public static void charOccurLen(String str, char val) {
		int count = 0;
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i)==val) {
				count++;
			}
		}
		System.out.println(val + " : " + count);
	}
}