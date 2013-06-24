package Collection;
import java.util.*;

public class IntegerListIterator{
	public static void main(String[] args){
		Random r = new Random(47);
		
		List<Integer> ints = new ArrayList<Integer>();
		
		for(int i = 0 ; i < 10 ; i++)
			ints.add(new Integer(r.nextInt(20)));
		
		System.out.println(ints);
		
		List<Integer> copy = new ArrayList<Integer>();
		
		ListIterator<Integer> it = ints.listIterator(ints.size());
		
		while(it.hasPrevious())
			copy.add(it.previous());
		System.out.println(copy);
		copy.clear();
		
	}
}