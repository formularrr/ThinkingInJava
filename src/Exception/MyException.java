package Exception;

public class MyException extends Exception{
	private String err ;
	
	public MyException(String err){
		super(err);
		this.err = err;
	}
	
	public void showErr(){
		System.out.println("show err :" + err);
	}
	
	public static void main(String[] args){
		try{
			throw new MyException("test exception");
			}catch(MyException me){
				me.showErr();
			}
			
			
	}
}