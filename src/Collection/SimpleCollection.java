package Collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SimpleCollection {
	public static void main(String[] args){
		Set<Integer> c = new TreeSet<Integer>();
		for(int i=10; i>0; i--)
			c.add(i);
		for(Integer i : c)
			System.out.print(i + " ");
	}
}
