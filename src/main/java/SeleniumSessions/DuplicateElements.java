package SeleniumSessions;

import java.util.HashSet;
import java.util.Set;

public class DuplicateElements {

	public static void main(String[] args) {
		
		String a[] = {"Java", "Javascript", "MAven", "POM", "SQL", "Java"};
		
		//find Duplicate Elements -O(n2) - Worst solution
		for(int i =0; i<a.length; i++) {
			for(int j=i+1; j<a.length; j++) {
				if(a[i].equals(a[j])) {
					System.out.println("Duplicate Element is : " + a[i]);
				}
			}
		}
		
		//2. using hashset - it stores only unique  values
		
		Set<String> store = new HashSet<String>();
		for(String name : a) {
			if(store.add(name) ==  false) {
				System.out.println("Duplicate Element is : " + name);
			}
		}


	}

}
