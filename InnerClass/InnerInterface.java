package InnerClass;

interface InnerInterface{
	void show();
	
	class Inner implements InnerInterface{
		public static void show(){
			System.out.println("InnerInterface");
		}
		
		public static void main(String[] args){
			Inner inner = new Inner();
			inner.show();
		}
	}
}

public class Imp implements InnerInterface{
	public void show(){
		System.out.println("Implements interface");
	}
	
	public static void main(String[] args){
		Imp i = new Imp();
		Inner.show();
	}
}