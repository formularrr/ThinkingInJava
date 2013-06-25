package Collection; 
import java.util.*;
import java.io.*;

public class GerbilMap{
	public static void main(String[] args){
		
		Map<String, Gerbil> gerbilMap = new HashMap<String, Gerbil>();
		gerbilMap.put("gerbil_0", new Gerbil(0));
		gerbilMap.put("gerbil_1", new Gerbil(1));
		gerbilMap.put("gerbil_2", new Gerbil(2));
		gerbilMap.put("gerbil_3", new Gerbil(3));
		
		System.out.println("Gerbil.key:" + gerbilMap.keySet());
		System.out.println("Gerbil.value:" + gerbilMap.values());
		
		for(String s : gerbilMap.keySet()){
			System.out.println(gerbilMap.get(s));
			gerbilMap.get(s).hop();
		}
			
	}
}