package com.java.lambda;

interface A
{
	void show(int i);
}
public class Lambda {

	public static void main(String[] args) 
	{
		A obj;
		obj= i->System.out.println("Hello "+i);
		obj.show(8);
		
	}

}
