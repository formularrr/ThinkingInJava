package Collection; 
import java.util.*;
import java.io.*;

public class PriorityQueueDemo{
	public static void main(String[] args){
		PriorityQueue<Double> pq = new PriorityQueue<Double>();
		
		Random r = new Random(47);
		
		for(int i = 0 ; i < 10 ; i++)
			pq.offer(r.nextDouble());
		
		while(pq.peek() != null)
			System.out.print(pq.poll() + " ");
		
		PriorityQueue<PriorityQueueDemo> demo = new PriorityQueue<PriorityQueueDemo>();
		demo.offer(new PriorityQueueDemo());
		//demo.offer(new PriorityQueueDemo());
		
		demo.poll();
	}
}