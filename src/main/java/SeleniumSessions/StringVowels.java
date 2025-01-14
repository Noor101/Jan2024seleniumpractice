package SeleniumSessions;

public class StringVowels {

	public static void main(String[] args) {
		
		String s = "I love reading";
		//print only vowels from the above text
		
		String v = "AEIOUaeiou";
		String a = "";
		
		for(int i =0; i<s.length(); i++) {
			char ch = s.charAt(i);
			if(v.contains(String.valueOf(ch))) {
				a = a+ch;
			}
		}
		System.out.println(a);
		
	}

}
