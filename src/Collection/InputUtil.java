
package Collection; 
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class InputUtil{
	public static String readFile(String path) throws IOException{
		FileReader fr = new FileReader(path);
		
		BufferedReader br= new BufferedReader(fr);
		String line = new String();
		String text = new String();
		
		while((line = br.readLine()) !=null)
			text += line;
		
		return text;
	}
	
	public static String removeTokens(String text){
		String result = new String();
		text.replaceAll("\n", "");
		for(int i = 0 ; i < text.length() ; i++)
			result += Character.toString(changeChar(text.charAt(i)));
		
		//result = removeTab(result);
		System.out.println(result + " ");
		
		return result;
	}
	
	public static String removeTab(String text){
		String[] rs = text.split(" ");
		String result = new String();
		
		for(String s : rs){
			if(s.compareTo(" ") != 0)
				result += s + "";
		}
		return result;
	}
	public static char changeChar(char c){
		char[] alpha = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789".toCharArray();
		
		for(char ch : alpha){
			if( c == ch)
				return c;
		}
		//System.out.println(c);
		return ' ';
	}
}