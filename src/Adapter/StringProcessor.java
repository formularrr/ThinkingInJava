package Adapter;

public abstract class StringProcessor implements Processor{
	
	public String name(){
		return this.getClass().getSimpleName();
	}
	
	public abstract String process(Object input);
	
	public static String s = "hello world";
	
	public static void main(String[] args){
		String s = "hello";
		//Processor p = new Upcase();
		//Apply.process(new FilterAdapter(), s);
	}
	
	
}
