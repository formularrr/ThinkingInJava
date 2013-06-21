package Adapter;

import java.io.IOException;
import java.nio.CharBuffer;
import java.util.Scanner;

public class RandomCharAdapter extends RandomChar implements Readable{

	private int count;
	
	public RandomCharAdapter(int count){
		super(count);
		this.count = count;
	}
	@Override
	public int read(CharBuffer cb) throws IOException {
		// TODO Auto-generated method stub
		if(count-- == 0)
			return -1;
		
		//System.out.println("read");
		String result = "";
		
		for(int i=0; i<10; i++)
			result+= this.next();
		cb.append(result);
		cb.append(" ");
		return 10;
	}
	
	public static void main(String[] args){
		Scanner sc = new Scanner(new RandomCharAdapter(10));
		
		while(sc.hasNext()){
			System.out.println(sc.next());
			//System.out.println();
		}
	}

}
