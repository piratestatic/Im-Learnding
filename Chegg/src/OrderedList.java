/*
 * Corey Hodges
 * Project 2
 * 12 June 2021
 * OrderedList
 *
 */

import java.util.*;

/*
 * The third class is OrderedList, which is a utility class 
 * that contains two overloaded implementations
 */
public class OrderedList {
	//Both methods should be class (static) methods.
	//The first of the overloaded methods should accept a list 
	//that contains elements that implement Comparable.
	public static <T extends Comparable<? super T>> 
	//two overloaded implementations of a method named checkSorted
	boolean checkSorted(List<T> list){
		boolean isSorted = true;

		for(int i = list.size()-1; i > 0 ; i--){
			T current = list.get(i);
			if(!checkSorted(list, current)){
				isSorted = false;
			}
		}
		return isSorted;
	}

	//The second should instead be supplied an additional 
	//parameter that is an object of a class that implements 
	//the Comparator interface
	private static <T extends Comparable<? super T>> 
			boolean checkSorted(List<T> list, T current) {

		
		T currentValue = list.get(list.indexOf(current));
		T nextValue = list.get(list.indexOf(current) - 1);

		if (nextValue != null) {

			return currentValue.compareTo(nextValue) >= 0; 
		}
		return true;
	}
}
