package Exception;

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

class SecondException extends Exception{
	
	private String s;
	
	public SecondException(String s){
		super(s);
		this.s = s;
	}
	
	public String getMessage(){
		return "Second Exception :" + s;
	}
}

class ThirdException extends Exception{
	
	private String s;
	
	public ThirdException(String s){
		super(s);
		this.s = s;
	}
	
	public String getMessage(){
		return "Third Exception :" + s;
	}
}

public class ThreeExceptions{
	public static void main(String[] args) throws Exception{
		Exception[] exception = new Exception[3];
		exception[0] = new FirstException("1");
		exception[1] = new SecondException("2");
		exception[2] = new ThirdException("3");
		
/*		for(int i = 0 ; i < 3 ; i++){
			try{
				throw exception[i];
				}catch(FirstException e){
					e.printStackTrace();
					System.out.println("Catch first:" + e.getMessage());
					}catch(SecondException e){
						e.printStackTrace();
						System.out.println("Catch second:" + e.getMessage());
						}catch(ThirdException e){
							e.printStackTrace();
							System.out.println("Catch third:" + e.getMessage());
						}
		}
*/		
		for(int i = 0 ; i < 3 ; i++){
			try{
				throw exception[i];
				}catch(Exception e){
					e.printStackTrace();
					System.out.println(e.getMessage());
					}finally{
						System.out.println("final");
					}
		}
	}
}