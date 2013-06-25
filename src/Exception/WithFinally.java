package Exception;
import java.util.*;


public class WithFinally{
	private static Switch sw = new Switch();
	
	public static void main(String[] args){
		try{
			sw.on();
			OnOffSwitch.f();
			OnOffException1 e = new OnOffException1();
			e.initCause(new NullPointerException());
			throw e;
			}catch(OnOffException1 e){
				e.printStackTrace();
				}catch(OnOffException2 e){
					e.printStackTrace();
					}finally{
						sw.off();
					}
	}
}