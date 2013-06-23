package InnerClass;

import InnerClass.Sequence.SequenceSelector;

public class InnerTest{
	public static void main(String[] args){
		SequenceSelector selector = (SequenceSelector) new Sequence("inner test").selector();
		System.out.println(selector.toString());
	}
}
