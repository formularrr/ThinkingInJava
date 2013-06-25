package Exception;
import java.util.*;

class Switch{
	private boolean state = false;
	
	public boolean read(){
		return state;
	}
	
	public void on(){
		state = true;
		System.out.println("on");
	}
	
	public void off(){
		state = false;
		System.out.println("off");
	}
}

class OnOffException1 extends Exception{
	
}

class OnOffException2 extends Exception{
	
}

public class OnOffSwitch{
	private static Switch sw = new Switch();
	
	public static void f() throws OnOffException1, OnOffException2{
		
	}
	
	public static void main(String[] args) throws OnOffException2{
		try{
			sw.on();
			OnOffException1 e = new OnOffException1();
			e.initCause(e);
			throw e;
			//f();
			}catch(OnOffException1 e){
				e.printStackTrace();
				}
				finally{
					sw.off();
				}
	}
}