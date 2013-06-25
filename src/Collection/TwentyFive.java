package Collection; 
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class TwentyFive{
	public static void main(String[] args) throws IOException{
		String text = InputUtil.readFile("/Users/formula/Documents/Code/ThinkingInJava/src/Collection/SimpleCollection.java");
		text = InputUtil.removeTokens(text);
		
		Map<String, ArrayList<Integer>> words = new HashMap<String, ArrayList<Integer>>();
		
		String[] str = text.split(" ");
		
		for(int i = 0 ; i < str.length ; i++){
			List<Integer> ints = words.get(str[i]);
			if(ints != null)
				ints.add(i);
			else {
				ints = new ArrayList<Integer>();
				ints.add(i);
			}
			
			words.put(str[i],(ArrayList<Integer>) ints);
		}
		
		System.out.println(words);
		
		String result = new String();
		Set<String> s = words.keySet(); 
		
		Iterator<String> it = s.iterator();
		int count = 0;
		while(it.hasNext()){
			String temp = it.next();
			List<Integer> ints = words.get(temp);
			//System.out.println(temp + " " +ints);
			if(ints.contains(count)){
				//System.out.println(count + "." + temp);
				result += temp + " ";
				count++;
				it = s.iterator();
			}
			
		}
		
		//System.out.println(result.compareTo(text));
		System.out.println(result);
	}
	
	

}