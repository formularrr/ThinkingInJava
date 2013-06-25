package Collection; 
import java.util.*;
import java.io.*;


public class NonCollectionSequence implements Iterable{
	private String[] words = "Non Collection Sequence class public java line".split(" ");
	public Iterable<String> reversed(){
		return new Iterable<String>(){
			public Iterator<String> iterator(){
				return new Iterator<String>(){
				
					int current = words.length-1;
				
					public boolean hasNext(){
						return current > -1;
					}
				
					public String next(){
						return words[current--];
					}	
				
					public void remove(){};
				};
			}
		};
	}
	
	public Iterable<String> randomized(){
		return new Iterable<String>(){
			public Iterator<String> iterator(){
				List<String> shuffled = new ArrayList<String>(Arrays.asList(words));
				Collections.shuffle(shuffled);
				return shuffled.iterator();
			}
		};
	}
	@Override
	public Iterator iterator() {
		// TODO Auto-generated method stub
		return new Iterator<String>(){
			int current = 0 ; 
			@Override
			public boolean hasNext() {
				// TODO Auto-generated method stub
				return  current < words.length;
			}

			@Override
			public String next() {
				// TODO Auto-generated method stub
				return words[current++];
			}

			@Override
			public void remove() {
				// TODO Auto-generated method stub
				
			}
			
		};
	}
	
	public static void main(String[] args){
		NonCollectionSequence ncs = new NonCollectionSequence();
		
		Iterator it =ncs.iterator();
		while(it.hasNext())
			System.out.print(it.next() + " ");
		
		for(String s : ncs.reversed())
			System.out.print(s + " ");
				
	    for(String s : ncs.randomized())
			System.out.print(s + " ");
	}
}