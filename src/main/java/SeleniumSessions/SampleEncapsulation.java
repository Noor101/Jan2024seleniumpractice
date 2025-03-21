package SeleniumSessions;

public class SampleEncapsulation {
	
	int id;
	String name;
	private double salary;

	public static void main(String[] args) {
		
		String s = "This is my java code";
		System.out.println(s.length());
		System.out.println(s.indexOf("java"));
		System.out.println(s.charAt(16));
		System.out.println(s.replace(" ", ""));
		
		if(s.contains("java")) {
			System.out.println("Java is found");
		}else {
			System.out.println("Java is not found");
		}

		System.out.println(s.substring(4, 15));
		
		String a[] = s.split(" ");
		for(String e: a) {
			System.out.println(e);
		}
		
		if(s.equals("Java")) {
			System.out.println("Java is found");

		}else {
			System.out.println("Java is not found");

		}

	}
	
	

}
