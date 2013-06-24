package InnerClass;

interface Selector{
	boolean end();
	Object current();
	void next();
}

class StringSequence{
	private String s;
	
	public StringSequence(String s){
		this.s = s;
	}
	
	public String toString(){
		return this.s;
	}
}

public class Sequence{
	private Object[] item;
	private int next = 0;
	private String sequence;
	
	public Sequence(int size){
		item = new Object[size];
	}
	
	public Sequence(String sequence){
		this.sequence = sequence;
	}
	
	public void add(Object x){
		if(next < item.length)
			item[next++] = x;
	}
	
	public Selector selector(){
		return this.new SequenceSelector();
	}
	
	public Selector reverseSelector(){
		return this.new ReverseSelector();
	}
	
	class SequenceSelector implements Selector{
		
		private int i=0;
		
		public boolean end(){
			return i == item.length;
		}
		
		public Object current(){
			return item[i];
		}
		
		public void next(){
			if(i < item.length)
				i++;
		}
		
		public String toString(){
			return sequence;
		}
		
		private String isOuterVisit(){
			return "outer visits inner's private methods";
		}
		
		public Sequence sequence(){
			
			return Sequence.this;
		}
	}
	
	class ReverseSelector implements Selector{
		
		private int i = next-1;
		
		public boolean end(){
			return i == -1;
		}
		
		public Object current(){
			return item[i];
		}
		
		public void next(){
			if(i < item.length)
				i--;
		}
		
		public String toString(){
			return sequence;
		}
		
		private String isOuterVisit(){
			return "outer visits inner's private methods";
		}
		
		public Sequence sequence(){
			
			return Sequence.this;
		}
	}
	
	public static void main(String[] args){
		StringSequence s1 = new StringSequence("first");
		StringSequence s2 = new StringSequence("second");
		StringSequence s3 = new StringSequence("third");
		
		Sequence sq = new Sequence(3);
		sq.add(s1);
		sq.add(s2);
		sq.add(s3);
		
		Selector selector = sq.selector();
		
		while(!selector.end()){
			System.out.print(selector.current() + " ");
			selector.next();
		}
		
		ReverseSelector reverseSelector = sq.new ReverseSelector();
		
		while(!reverseSelector.end()){
			System.out.print(reverseSelector.current() + " ");
			reverseSelector.next();
		}
		
		Sequence String = new Sequence("\n Show sequence by InnerClass");
		
		SequenceSelector sequenceSelector = String.new SequenceSelector();
		
		
		//System.out.println(String.selector().toString());
		
		
		//System.out.println(sequenceSelector.sequence().selector().isOuterVisit());
	}
}