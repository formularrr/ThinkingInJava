package Collection;

import java.util.*;


public class MoviesCollection {
	
	private String[] movies ;
	private int current = 0;
	private int size = 4;
	public MoviesCollection(){
		movies = new String[5];
		movies[0] = "Super Man";
		movies[1] = "Harry Potter";
		movies[2] = "The Others";
		movies[3] = "Death";
	}
	
	public String next(){
		
		String s = movies[current];
		
		if( current == 3)
			current = 0;
		else current++;
		
		return s;
	}
	
	public static void main(String[] args){
		
	}
	

}
