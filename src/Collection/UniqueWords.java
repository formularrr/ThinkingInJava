package Collection; 
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class UniqueWords{
	public static void main(String[] args) throws IOException{
		String text = InputUtil.readFile("/Users/formula/Documents/Code/ThinkingInJava/src/Collection/SimpleCollection.java");
		text = InputUtil.removeTokens(text);
		Set<String> words = new TreeSet<String>(String.CASE_INSENSITIVE_ORDER);
		Collections.addAll(words, text.split(" "));
		System.out.println(words);
		
		Map<String, Integer> wordsMap = new HashMap<String, Integer>();
		String[] str = text.split(" ");
		for(String s : str){
			
			wordsMap.put(s, wordsMap.get(s) == null? 1 : wordsMap.get(s)+1);
		}
		System.out.println(wordsMap);
	}
	
	

}