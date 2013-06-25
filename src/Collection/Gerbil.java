package Collection; 
import java.util.*;
import java.io.*;

public class Gerbil{
	private int gerbilNumber;
	
	public Gerbil(int gerbilNumber){
		this.gerbilNumber = gerbilNumber;
	}
	
	public void hop(){
		System.out.println("no." + this.gerbilNumber + " is hopping");
	}
	
	public String toString(){
		return "Gerbil_" + this.gerbilNumber;
	}
}
