package SeleniumSessions;

import net.bytebuddy.agent.builder.AgentBuilder.CircularityLock.Default;

public class Loops {

	public static void main(String[] args) {
		
		//for loops
		
		for(int i=0; i<=100; i++) {
			System.out.println(i);
		}
		
		//while loops
		
		
		System.out.println("****************");
		
		int j = 1;
		
		while(j<=100) {
			System.out.println(j);
			j++;
		}
		
		System.out.println("*****************");
		
		//do-while loops
		
		int x = 1;
		do {
			System.out.println(x);
			x++;
		}while(x<=100);
		
		//switch case
		
		String s = "Chromehghg";
		switch(s.toLowerCase().trim()) {
		case "chrome":
			System.out.println("chrome is passed");
			break;
			
		case "Firefox":
			System.out.println("firefox is passed");
			break;
		
		default:
		System.out.println("Please pass the correct browser");
		}
		
		System.out.println("****************");
		
		int y =1;
		for(int i = 0; i<=100; i++) {
			System.out.println(i);
		}
		
		System.out.println("****************");

		int r = 1;
		while(r<=5) {
			System.out.println(r);
			r++;
		}
		
		System.out.println("****************");

		int e = 1;
		do{
			System.out.println(e);
			e++;
		}while(e<=5);
	
		int day =2;
		switch(day) {
		case 1 :
			System.out.println("Monday");
			break;
			
		case 2:
			System.out.println("Tuesday");
			break;
			
		case 3:
			System.out.println("Wednesday");
			break;
		}
	}

}
