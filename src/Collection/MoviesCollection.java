package Collection;

import java.util.*;


public class MoviesCollection {
	
	private String[] movies ;
	private int current = 0;
	private int size = 5;
	public MoviesCollection(){
		movies = new String[5];
		Random r = new Random(47);
		
		for(int i=0; i<5; i++)
			movies[i] = Integer.toString(r.nextInt(25));
	}
	
	public  String next(){
		
		String s = movies[current];
		
		if( current == 4)
			current = 0;
		else current++;
		
		return s;
	}
	
	public void setCurrent(){
		current = 0;
	}
	
	public static void main(String[] args){
		MoviesCollection mc = new MoviesCollection();
		
		String[] moviesArray = new String[10];
		for(int i=0; i<10; i++)
			moviesArray[i] = mc.next();
		System.out.println(Arrays.toString(moviesArray));
		
		List<String> moviesArrayList= new ArrayList<String>();
		for(int i=0; i<10; i++)
			moviesArrayList.add(mc.next());
		System.out.println(moviesArrayList);
		
		List<String> moviesLinkedList = new LinkedList<String>();
		for(int i=0; i<10; i++)
			moviesLinkedList.add(mc.next());
		System.out.println(moviesLinkedList);
		
		HashSet<String> moviesHashSet = new HashSet<String>();
		for(int i=0; i<10; i++)
			moviesHashSet.add(mc.next());
		System.out.println(moviesHashSet);
			 
		LinkedHashSet<String> moviesLinkedHashSet = new LinkedHashSet<String>();
		for(int i=0; i<10; i++)
			moviesLinkedHashSet.add(mc.next());
		System.out.println(moviesLinkedHashSet);
		
		TreeSet<String> moviesTreeSet = new TreeSet<String>();
		for(int i=0; i<10; i++)
			moviesTreeSet.add(mc.next());
		System.out.println(moviesTreeSet);
	}
	

}
