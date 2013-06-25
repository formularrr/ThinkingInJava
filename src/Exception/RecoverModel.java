package Exception;

public class RecoverModel{
	public static void main(String[] args){
		int count = 5;
		
		while(count-- > 0 ){
			try{
				throw new MyException(Integer.toString(count));
				}catch(MyException me){
					me.showErr();
				}
		}
		
		System.out.println("There's no error");
	}
}