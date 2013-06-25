package Collection; 
import java.util.*;
import java.io.*;

class Command{
	private String s ;
	public Command(String s){
		this.s = s;
	}
	
	public void operation(){
		System.out.println(s);
	}
	
}

class UseCommand{
	public static Command add(Command c , Queue<Command> q){
		q.offer(c);
		return c;
	}
}

public class Use{
	public static void main(String[] args){
		Queue<Command> queue = new LinkedList<Command>();
		Command command = new Command("command");
		
		show(command , queue);
	}
	
	public static void show(Command c , Queue<Command> q){
		UseCommand.add(c,q);
		while(q.peek() != null){
			q.remove().operation();
		}
	}
}