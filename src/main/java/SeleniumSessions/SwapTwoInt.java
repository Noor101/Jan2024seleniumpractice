package SeleniumSessions;

public class SwapTwoInt {

	public static void main(String[] args) {
		
		int x= 5;
		int y = 10;
		
		//using 3rd variable
		
		int t;
//		
//		t = x; //5
//		x = y; //10
//		y = t;// 5
		
//		System.out.println(x);
//		System.out.println(y);
		
//		x = x+y;//15
//		y = x-y;//5
//		x = x-y;//10
//		
//		System.out.println(x);
//		System.out.println(y);
		
		x = x * y; //50
		y = x/y; //5
		x = x/y; //10
		
		System.out.println(x);
		System.out.println(y);
		
		


	}

}
