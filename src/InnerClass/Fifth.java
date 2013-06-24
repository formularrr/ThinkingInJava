package InnerClass;

interface Inter{
	void show();
}

public class Fifth{
	public Inter useInner(){
		
		class Inner implements Inter{
			public void show(){
				System.out.println("Using Inner in methods");
			}
		}
		
		Inner inner = new Inner();
		inner.show();
		return inner;
	}
	
	private class Inner implements Inter{
		public void show(){
			System.out.println("Private Inner");
		}
	}
	
	public Inter getInter(){
		return new Inter(){
			public void show(){
				System.out.println("An anonymous inner class");
			}
		};
	}
	
	public Inner getInner(){
		
		return this.new Inner();
	}
	public static void main(String[] args){
		Fifth outer = new Fifth();
		//inter inte = outer.useInner();
		//inte.show();
		Inter innerInter = outer.getInner();
		Inner inner = (Inner)innerInter;
		inner.show();
		outer.getInter().show();
	}
}