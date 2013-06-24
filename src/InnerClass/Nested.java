package InnerClass;

public class Nested{
	
	static class Inner{
		
		static class NestedInner{
			public static void show(){
				System.out.println("NestedClass");
			}
		}
	}
	
	public static void main(String[] args){
		Inner.NestedInner.show();
	}
}