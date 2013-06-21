package Adapter;

public class StringExchange {
	public String name(){
		return this.getClass().getName();
	}
	
	public String process(String s){
		
		System.out.println("StringExchange.process " + s);
		
		char[] str = s.toCharArray();

		int len = str.length;
		
		for(int i=0; i<len; i+=2){
			if(i+1 < len){
				char temp = str[i];
				str[i] = str[i+1];
				str[i+1] =temp;
			}
		}
		
		String temp = "";
		for(int i=0; i<len; i++)
			temp += str[i];
		return temp;
	}
}
