package InnerClass;

class WithInner{
	class Inner{
		public  Inner(String s){
			System.out.println("inner." + s);
		}
	}
}

public class Inherit{
	WithInner wi = new WithInner();
	class InheritInner extends WithInner.Inner{
		public InheritInner(String s){
			wi.super(s);
			System.out.println("InheritInner." + s);
		}
		
	}
	
	public static void main(String[] args){
		String s = "Test InheritInner";
		
		InheritInner ii = new Inherit().new InheritInner(s);
	}
}