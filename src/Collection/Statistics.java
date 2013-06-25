package Collection;
import java.util.*;
import java.io.*;

public class Statistics{
	public static void main(String[] args){
		Random r = new Random(47);
		
		Map<Integer, Integer> m = new HashMap<Integer, Integer>();
		
		for(int i = 0 ; i < 1000 ; i++){
			int j = r.nextInt(20);
			Integer freq = m.get(j);
			m.put(j, freq == null ? 1 :freq+1);
		}
		
		System.out.println(m);	
		
		//Integer[] ints = m.keySet();
		System.out.println(m.keySet());
		
		Map<Integer, Integer> sortedM = new LinkedHashMap<Integer, Integer>();
		for(Integer i : m.keySet()){
			sortedM.put(i, m.get(i));
		}
		
		System.out.println(sortedM);
		
	}
}