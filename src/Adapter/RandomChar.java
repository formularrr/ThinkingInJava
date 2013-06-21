package Adapter;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Random;

public class RandomChar {
	private Random r = new Random(47);
	
	int count;
	
	private String randomString;
	private static char[] charArray = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz".toCharArray();;
	
	public RandomChar(int count){
		this.count = count;
		randomString = this.makeString(count);
		//System.out.print(this.getRandomString());
	}
	
	public char next(){
		return charArray[r.nextInt(52)];
	}
	
	public String makeString(int count){
		
		String temp = "";
		
		for(int i=0; i<count; i++)
			temp+= this.next();
		
		return temp;
	}
	
	public String getRandomString(){
		return this.randomString;
	}
	public static void main(String[] args){
		RandomChar rc = new RandomChar(10);
		System.out.print(rc.getRandomString());
	}

}
