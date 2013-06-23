package InnerClass;

public class ExeciseSenven{
	private String outer = "outer";
	
	public ExeciseSenven(String outer){
		this.outer = outer;
	}
	
	private void show(){
		System.out.println("showing " + outer);
	}
	
	public void getInner(){
		Inner inner = this.new Inner();
		inner.changeOuter();
	}
	
	class Inner{
		public void changeOuter(){
			outer = "inner";
			show();
		}
		
	}
	
	public void changeOuter(String s){
		new ExeciseSenven(s){
			public void changeOuter(){
				outer = outer +  "  by anonymous";
				System.out.println(outer);
			}
			}.changeOuter();
	}
	
	public static void main(String[] args){
		ExeciseSenven outer = new ExeciseSenven("outer out");
		//outer.getInner();
		outer.changeOuter("change");
	}
}