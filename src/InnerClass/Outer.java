package InnerClass;

public class Outer{
	
	class Inner{
		public Inner(){
			System.out.println("inner constructer");
		}
	}
	
	public  Inner getInner(){
		
		return this.new Inner();
	}
	
	public static void main(String[] args){
		Inner inner = new Outer().getInner();
	}
}