package Adapter;

public class StringExAdapter implements Processor{
	StringExchange se ; 
	public StringExAdapter(StringExchange se){
		this.se = se;
	}
	@Override
	public String name() {
		// TODO Auto-generated method stub
		return se.name();
	}
	@Override
	public Object process(Object input) {
		// TODO Auto-generated method stub
		System.out.println("StringExAdapter.process");
		return se.process((String)input);
	}
	
	public static void main(String[] agrs) {
		Apply.process(new StringExAdapter(new StringExchange()), "hel9o6");
	}

}
