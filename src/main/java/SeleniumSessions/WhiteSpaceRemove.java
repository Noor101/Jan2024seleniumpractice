package SeleniumSessions;

public class WhiteSpaceRemove {

	public static void main(String[] args) {
		
		String s = "   This is my java course    ";
		System.out.println(s.trim());
		
		System.out.println(s.replaceAll("\\s+", ""));
		
		System.out.println(s.indexOf('m'));
		System.out.println(s.indexOf('i', 8));
		
		if(s.indexOf("java")>1) {
			System.out.println("java is found");
		}
		
		System.out.println(s.indexOf("java"));
		
		
		System.out.println(s.substring(5));
		System.out.println(s.substring(4, 11));
		
		String s1 = "JAVaXxtestXxpanoomaXx";
		String a[] = s1.split("Xx");
		for(String e : a) {
			System.out.println(e);
		}


	}

}
