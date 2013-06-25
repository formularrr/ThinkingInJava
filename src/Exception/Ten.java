package Exception;
import java.util.*;


class FirstException extends Exception{
	
	private String s;
	
	public FirstException(String s){
		super(s);
		this.s = s;
	}
	
	public String getMessage(){
		return "First Exception :" + s;
	}
}

public class Ten{
	public static void f() throws FirstException{
		try{
			g();
			}catch(MyException me){
				me.printStackTrace();
				throw new FirstException("f()");
			}
	}
	
	//Runtime Exception
	public static void g() throws MyException{
		MyException me = new MyException("g().MyException");
		me.initCause(new NullPointerException());
		throw me;
	}
	
	public static void main(String[] args) throws FirstException{
		f();
	}
}