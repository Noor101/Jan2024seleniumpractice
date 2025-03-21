package SeleniumSessions;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateWord {

	public static void main(String[] args) {
		findDuplicate("java is best programming language is java is java");
		findDuplicate("hihis his hi hi");

		
	}
	
	//Java is best programming language is java is java
	//count number of duplicate words in the given string
	
	public static void findDuplicate(String inputString) {

		
		String words[] = inputString.split(" ");
		Map<String, Integer> wordsCount = new HashMap<String, Integer>();
		for(String word : words) {
			if(wordsCount.containsKey(word)) {
				wordsCount.put(word, wordsCount.get(word)+1);
			}else {
				wordsCount.put(word, 1);
			}
		}
		
		Set<String> wordsInString = wordsCount.keySet();
		for(String word : wordsInString) {
			if(wordsCount.get(word)>1) {
				System.out.println(word + " : " + wordsCount.get(word));
			}
		}
		
			
	}

}
