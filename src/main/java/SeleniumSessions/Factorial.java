package SeleniumSessions;

public class Factorial {

	// to find the factorial of the number - 3 = 3*2*1 = 6

	public static void main(String[] args) {
		System.out.println(factorial(3));
		System.out.println(factorial(10));
		System.out.println(fact(7));
		System.out.println(fact(3));

	}

	// 1. Without recursive

	public static int factorial(int num) {
		if (num == 0)
			return 1;
		int fact = 1;
		for (int i = 1; i <= num; i++) {
			fact = fact * i;
		}
		return fact;
	}

	// 2. with recursive - a function calling itself

	public static int fact(int num) {
		if (num == 0)
			return 1;
		else
			return (num * fact(num - 1));
	}

}
