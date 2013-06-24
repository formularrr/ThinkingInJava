package InnerClass;

import java.util.Arrays;

interface U{
	void method1();
	void method2();
	void method3();
}

class A{
	private String s;
	
	public A(String s){
		this.s = s;
	}
	public U makeU(){
		return new U(){
			public void method1(){
				System.out.println(s + ".method1");
			}
			
			public void method2(){
				System.out.println(s + ".method2");
			}
			
			public void method3(){
				System.out.println(s + ".method3");
			}
			
			public String toString(){
				return s + ".U";
			}
		};
	}
}

class B{
	U[] UArray;
	
	public void makeU(U[] Urray){
		
		UArray = new U[Urray.length];
		
		for(int i=0; i<Urray.length; i++)
			UArray[i] = Urray[i];
	}
	
	public void setUArrayToNull(){
		this.UArray = null;
	}
	
	public void visit(){
		for(U u : UArray){
			
			u.method1();
			u.method2();
			u.method3();
			
			System.out.println(u);
		}
			
	}
}

public class Execise23{
	public static void main(String[] args){
		
		A[] Aarray = new A[3];
		for(int i=0; i<3; i++)
			Aarray[i]= new A("A" + i);
		
		U[] UArray = new U[3];
		for(int i=0; i<3; i++)
			UArray[i] = Aarray[i].makeU();
		
		
		B b = new B();
		b.makeU(UArray);
		b.visit();
	}
}