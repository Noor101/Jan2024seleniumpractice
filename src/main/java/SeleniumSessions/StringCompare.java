package SeleniumSessions;

public class StringCompare {

	public static void main(String[] args) {

		// fiding common values from both Strings

		String s1 = "apple";
		String s2 = "peach";

		String common = "";
		for (int i = 0; i < s1.length(); i++) {
			char c = s1.charAt(i);
			if (s2.contains(String.valueOf(c)) && !common.contains(String.valueOf(c))) { // a && "".a
				common = common + c;
			}
		}

		System.out.println(common);

		// finding unique values from both string

		String unique = "";

		for (int i = 0; i < s1.length(); i++) {
			char c = s1.charAt(i);
			if (!s2.contains(String.valueOf(c))) {
				unique = unique + c;
			}

		}

		for (int i = 0; i < s2.length(); i++) {
			char c = s2.charAt(i);
			if (!s1.contains(String.valueOf(c))) {
				unique = unique + c;
			}

		}

		System.out.println(unique);

	}

}
