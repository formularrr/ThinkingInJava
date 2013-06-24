package Collection;
import java.nio.charset.Charset;
import java.util.*;

public class Stack<T>{
	private LinkedList<T> storage = new LinkedList<T>();
	
	public void push(T t){
		storage.addFirst(t);
	}
	
	public T peek(){
		return storage.getFirst();
	}
	
	public T pop(){
		return storage.removeFirst();
	}
	
	public boolean empty(){
		return storage.isEmpty();
	}
	
	public String toString(){
		return storage.toString();
	}
	
	public static void main(String[] args){
		String s = "+U+n+c---+e+r+t---+a-+i-+n+t+y---+u-+r+u--+l+e+s---";
		
		Stack<String> charStack = new Stack<String>();
		
		for(int i = 0 ; i < s.length() ; i++){
			if(s.charAt(i) == '+')
				;
			else if(s.charAt(i) == '-')
				System.out.println("pop " + charStack.pop());
			
			else charStack.push(Character.toString(s.charAt(i)));
		}
	}
}