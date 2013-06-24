package Collection;
import java.util.*;

public class IntegerListFeature{
	public static void main(String[] args){
		Random r = new Random(47);
		
		List<Integer> ints = new ArrayList<Integer>();
		
		for(int i = 0 ; i < 8 ; i++)
			ints.add(r.nextInt(20));
		System.out.println("1." + ints);
		
		Integer i = new Integer(r.nextInt(20));
		ints.add(i);
		System.out.println("2." + ints);
		System.out.println("3." + ints.contains(i));
		ints.remove(i);
		
		Integer j = ints.get(2);
		System.out.println("4." + j + " " + ints.indexOf(j));
		
		Integer k = new Integer(1);
		System.out.println("5." + ints.indexOf(k));
		System.out.println("6." + ints.remove(k));
		//System.out.println(ints);
		System.out.println("7." + ints.remove(j));
		System.out.println("8." + ints);
		
		ints.add(3 , new Integer(r.nextInt(20)));
		System.out.println("9." + ints);
		
		List<Integer> sub = ints.subList(1,4);
		System.out.println("10." + sub  + ints.containsAll(sub));
		
		Collections.sort(sub);
		System.out.println("Sorted sub:" + sub);
		System.out.println("11." + ints.containsAll(sub));
		
		Collections.shuffle(sub, r);
		System.out.println("12." + sub +ints.containsAll(sub));
		
		List<Integer> copy = new ArrayList<Integer>(ints);
		sub = Arrays.asList(ints.get(1),ints.get(4));
		System.out.print("13 .copy sub" + sub);
		copy.retainAll(sub);
		System.out.println(" " + copy);
		
		copy = new ArrayList<Integer>(ints);
		//System.out.println("14." + copy);
		copy.remove(2);
		System.out.println("14." + copy);
		copy.removeAll(sub);
		System.out.println("14." + copy);
		
		Iterator<Integer> it = copy.iterator();
		while(it.hasNext()){
			System.out.println(it.next() + ",");
		}
		
		copy.clear();
	}
}