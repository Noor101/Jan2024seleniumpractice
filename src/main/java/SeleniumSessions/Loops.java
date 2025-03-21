package SeleniumSessions;

import java.util.ArrayList;

public class Loops {

	
	public static final int wheels = 4;

	public static void main(String[] args) {

		// for loops

		for (int i = 0; i <= 100; i++) {
			System.out.println(i);
		}

		// while loops

		System.out.println("****************");

		int j = 1;

		while (j <= 100) {
			System.out.println(j);
			j++;
		}

		System.out.println("*****************");

		// do-while loops

		int x = 1;
		do {
			System.out.println(x);
			x++;
		} while (x <= 100);

		// switch case

		String browser = "Chromehghg";
		switch (browser.toLowerCase().trim()) {
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

		int y = 1;
		for (int i = 0; i <= 100; i++) {
			System.out.println(i);
		}

		System.out.println("****************");

		int r = 1;
		while (r <= 5) {
			System.out.println(r);
			r++;
		}

		System.out.println("****************");

		int e = 1;
		do {
			System.out.println(e);
			e++;
		} while (e <= 5);

		int day = 2;
		switch (day) {
		case 1:
			System.out.println("Monday");
			break;

		case 2:
			System.out.println("Tuesday");
			break;

		case 3:
			System.out.println("Wednesday");
			break;
		}

		System.out.println("*************");

		for (char c = 'a'; c <= 'z'; c++) {
			System.out.println((int) c);
		}

		Object a[] = new Object[2];
		a[0] = "Google";
		a[1] = 123;

		for (Object t : a) {
			System.out.println(t);
		}
		System.out.println(a.length);
		
		ArrayList<String> ar = new ArrayList<String>();
		ar.add("Noor");
		ar.add("Mohammed");
		
		for(int i=0; i<ar.size(); i++) {
		System.out.println(ar.get(i));
		}
		
		for(String e1 : ar) {
			System.out.println(e1);
		}
		
		
		int i1 = 0;
		while(i1<=100) {
			System.out.println(i1);
			i1++;
		}
		
		
		int y1 =1;
		do {
			System.out.println(y1);
			y1++;
		}while(y1<=100);
		
		
		int n[] =  new int[4];
		n[0] = 1;
		
		int w[] = {1, 2, 3, 4};
		System.out.println(w[3]);
		int len = w.length;

		
		for(char c= 'a'; c<='z'; c++) {
			System.out.println((int)c);
		}
		
		
		ArrayList<String> br = new ArrayList<String>();
		br.add("Red");
		br.add("yellow");
		br.add("blue");
		
		System.out.println(br.size());
		for(int p =0; p<br.size()-1; p++) {
			System.out.println(br.get(p));
		}
		
		String s = "valid test case";
		System.out.println(s.indexOf("d"));
		System.out.println(s.substring(5));
		System.out.println(s.substring(4, 10));
		System.out.println(s.charAt(11));
		
		if(s.contains("case")) {
			System.out.println("pass");
		}else {
			System.out.println("fail");

		}
		
		ArrayList<String> as = new ArrayList<>();
		as.add("pink");
		as.add("red");
		as.add("yellow");
		
		for(int i=0; i<as.size(); i++) {
			System.out.println(as.get(i));
		}

		
	}

}
