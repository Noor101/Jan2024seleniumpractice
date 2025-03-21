package SeleniumSessions;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DigitsFrequency {

	public static void main(String[] args) {
		
		//121  = 1:2 2:1
		
		digitCountFrequency(121);
		System.out.println("***********");
		digitCountFrequency(423423433);
		
		System.out.println("***********");

		digitCountFrequency(1);

	}
	
	public static void digitCountFrequency(long num) {

		if(String.valueOf(num).length()==1) {
			System.out.println(num + " : " +  1);
			return;
		}
		Map<Long, Integer> digitMap = new HashMap<Long, Integer>();
		while(num!=0) {
			long lastDigit = num%10;
			if(digitMap.containsKey(lastDigit)) {
				digitMap.put(lastDigit, digitMap.get(lastDigit)+1);
			}
			else {
				digitMap.put(lastDigit, 1);
			}
			
			num = num/10;
		}
		Set<Long> keys = digitMap.keySet();
		for(Long key : keys) {
			System.out.println(key + " : " + digitMap.get(key));
		}
		
	
	}

}
