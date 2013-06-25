package Collection; 
import java.util.*;
import java.io.*;

public class CountUniqueWords{
	
	private static Map<Character, Integer> yuanYin = new HashMap<Character, Integer>();
	public CountUniqueWords(){
		String s = new String("AEIOUaeiou");
		
		for(int i = 0 ; i < s.length() ; i++){
			yuanYin.put(s.charAt(i), 0);
		}
	}
	public static void main(String[] args)  throws IOException{
		
		String text = InputUtil.readFile("/Users/formula/Documents/Code/ThinkingInJava/src/Collection/SimpleCollection.java");
		text = InputUtil.removeTokens(text);
		Set<String> words = new TreeSet<String>();
		Collections.addAll(words, text.split(" "));
		System.out.println(words);
		
		Iterator<String> it = words.iterator();
		int countAll = 0 ;
		while(it.hasNext()){
			String temp = it.next();
			int count = countYuanYin(temp);
			System.out.println("'" + temp + "'" + " has " + count + " yuanyin");
			countAll += count;
			
		}
		
		System.out.println("The text has " + countAll + " yuanyin");
		System.out.println("yuanyin words appears :" + yuanYin);
		
	}
	
	public static int countYuanYin(String s){
		int count = 0 ;
		
		for(int i = 0 ; i < s.length() ; i++)
			if(isYuanYin(s.charAt(i))){
				char c = s.charAt(i);
				count ++;
				yuanYin.put(c, yuanYin.get(c) == null ? 1 : yuanYin.get(c)+1);
			}
		
		return count;
	}
	
	public static boolean isYuanYin(char c){
		String yuanYin = "AEIOUaeiou";
		
		for(int i = 0 ; i < yuanYin.length() ; i ++){
			if(c == yuanYin.charAt(i))
				return true;
		}
		
		return false;
	}
}