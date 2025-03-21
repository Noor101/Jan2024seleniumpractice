package SeleniumSessions;

public class ArmstrongNum {

	public static void main(String[] args) {

		isArmstrongNum(153);
		isArmstrongNum(370);
		isArmstrongNum(251);


	}
	
	//153 = 1*1*1 5*5*5 3*3*3
	public static void isArmstrongNum(int num) {
		
		int cube = 0;
		int r;
		int t;
		
		t=num;
		while(num>0) {
			r = num%10;
			num = num/10;
			cube = cube+(r*r*r);
		}
		if(t==cube) {
			System.out.println("This is an armstrong number");
		}
		else {
			System.out.println("This is not an armstrong number");
		}

	}

}
