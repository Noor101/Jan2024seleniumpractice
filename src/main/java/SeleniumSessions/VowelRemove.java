package SeleniumSessions;

public class VowelRemove {

	public static void main(String[] args) {
		
		vowelRemove("Hello World");
	}
	
	public static void vowelRemove(String s) {
		
		String vowels = "aeiouAEIOU";
		String rem = "";
		
		for(int i=0; i<s.length(); i++) {
			char c = s.charAt(i);
			if(!vowels.contains(String.valueOf(c))) {
				rem = rem+c;
			}

		}
		
		System.out.println(rem);

		
				
	}

}
