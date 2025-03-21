package SeleniumSessions;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListIteration {

	public static void main(String[] args) {

		ArrayList<String> color = new ArrayList<String>();
		color.add("Blue");
		color.add("Red");
		color.add("Yellow");
		color.add("Green");
		color.add("White");

		// Different types of array list iteraton

		// 1. for loop

		for (int i = 0; i < color.size(); i++) {
			System.out.println(color.get(i));
		}

		// 2. for each loop

		for (String s : color) {
			System.out.println(s);
		}

		System.out.println("******");
		// 3. using iterator

		Iterator<String> it = color.iterator();
		while (it.hasNext()) {
			String list = it.next();
			System.out.println(list);
		}

		System.out.println("******");

		// 4. Streams

		color.forEach(e -> {
			System.out.println(e);
		});
		
		System.out.println("******");

		//5. listItertor
	
		ListIterator<String> colorIterator = color.listIterator(color.size());
		while(colorIterator.hasPrevious()) {
			String list = colorIterator.previous();
			System.out.println(list);
		}
		
	}

}
