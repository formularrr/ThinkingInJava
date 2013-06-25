package Exception;
class None{
	public void show(){}
}
public class ExceptionDemo{
	public static void main(String[] args) {
		try{
			throw new Exception("Exception Demo");
			}catch(Exception e){
				e.printStackTrace();
			}finally{
				System.out.println("finally");
			}
			
			try{
				None n = new None();
				n = null;
				n.show();
				}catch(Exception e){
					e.printStackTrace();
				}
				
				try{
					int[] ints = new int[5];
					System.out.println(ints[5]);
					}catch(Exception e){
						e.printStackTrace();
					}
					
					None n2 = new None();
					n2 = null;
					n2.show();
	}
}