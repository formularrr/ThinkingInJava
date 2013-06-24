package Collection;

import java.lang.reflect.Array;
import java.util.*;
import java.util.Arrays;
import java.util.Collection;

public class AddingGroups {
	public static void main(String[] args){
		Collection<Integer> collection = new ArrayList<Integer>(Arrays.asList(1,2,3,4));
		Integer[] moreInts ={6, 7, 8, 9, 10};
		collection.addAll(Arrays.asList(moreInts));
		collection.addAll(collection);
		
		for(Integer i : collection)
			System.out.print(i + " ");
	}

}
