package Collection; 
import java.util.*;
import java.io.*;


public class Pet{
	private String name;
	private static String[] names = ("Rat,Manx,Cymic,Mutt,Pug").split(",");
	
	public Pet(String name){
		this.name = name;
	}
	
	public String toString(){
		return this.name;
	}
	
	public static Pet[] createArray(int size){
		Random r = new Random(47);
		Pet[] pets = new Pet[size];
		
		for(int i = 0 ; i < size ; i++)
			pets[i] = new Pet(names[(int)r.nextInt(5)]);
		
		return pets;
	}
}