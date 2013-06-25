package String;
import java.util.*;

public class UsingStringBuilder{
	public static Random r = new Random(47);
	
	public String toString(){
		StringBuilder s = new StringBuilder("[");
		for(int i = 0 ; i < 25 ; i++){
			s.append(r.nextInt(100));
			s.append(", ");
		}
		
		s.delete(s.length()-2, s.length());
		s.append("]");
		return s.toString();
	}
	
	public static void main(String[] args){
		UsingStringBuilder usb = new UsingStringBuilder();
		System.out.println(usb);
	}
}