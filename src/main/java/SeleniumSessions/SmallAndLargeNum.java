package SeleniumSessions;

public class SmallAndLargeNum {

	public static void main(String[] args) {
		
		
		int a[] = {-10, 23, -765, -31233, 3424234, 50, 124214144};
		
		//find the small and largest number in the above array
		
		int largest = a[0];
		int smallest = a[0];
		
		for(int i =1; i<a.length; i++) {
			if(a[i]>largest) {
				largest = a[i];
			}
			else {
				if(a[i]<smallest) {
					smallest = a[i];
				}
			}
		}
		
		System.out.println("Largest number is " + largest);
		
		System.out.println("Smallest number is " + smallest);


	}

}
