package String;

public class InfiniteRecursion{
	public String toString(){
		return "InfiniteRecursion : " + super.toString();
	}
	
	public static void main(String[] args){
		System.out.println(new InfiniteRecursion());
	}
}