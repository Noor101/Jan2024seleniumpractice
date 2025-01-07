package SeleniumSessions;

public class JunkRemove {

	public static void main(String[] args) {
		
		String s = "$$#$%#$%#$%selenium%@#%@#%%@";
		
		//Regular expressions [a-zA-Z0-9]
		
		s = s.replaceAll("[^a-zA_Z0-9]", "");
		System.out.println(s);
		

	}

}
