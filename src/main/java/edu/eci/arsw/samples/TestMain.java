package edu.eci.arsw.samples;

public class TestMain {

	public static void main(String[] args) {
		AbstractProductA a=null;
		AbstractProductB b=null;
		
		a=AbstractFactory.getInstance().getProductA();
		
		b=AbstractFactory.getInstance().getProductB();
		
		System.out.println(a.methodA());
		System.out.println(b.methodB());
		
		
	}
	
}
