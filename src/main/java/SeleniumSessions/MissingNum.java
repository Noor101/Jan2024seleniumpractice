package SeleniumSessions;

public class MissingNum {
	
	public static void main(String args[]) {
		
		int a[] = {1,2,3,4,5,6,8,9};
		int sum = 0;
		
		for(int i=0; i<a.length; i++) {
			sum = sum +a[i];
		}
		System.out.println(sum);
		
		int sum1 =0;
		for(int j=1; j<=9; j++) {
			sum1 = sum1+j;
		}
		
		System.out.println(sum1-sum);
		
		int b[] = {1,2,4,5,6,};
		int s = 0;
		
		for(int i=0; i<b.length; i++) {
			s = s+b[i];
		}
		System.out.println(s);
		
		int s1=0;
		for(int j=1; j<=6; j++) {
			s1=s1+j;
		}
		
		System.out.println(s1-s);
		
	}
}



