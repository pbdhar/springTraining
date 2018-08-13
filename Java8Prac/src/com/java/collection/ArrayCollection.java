package com.java.collection;

import java.util.List;
import java.util.Arrays;

public class ArrayCollection {

	public static void main(String[] args) 
	{
		List<Integer> values= Arrays.asList(4,5,6,7,8);
		
		//values.forEach(i->System.out.println(i));
		values.forEach(System.out::println);
	}

}
