package com.cts.junit;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;



public class TruncateToAStringTest {

	
	@Test
	public void testTruncateAInFirstTwoPositionPositive()
	{
		//Arrange
		System.out.println("Inside Positive Junit case");
		TruncateToAString t2as =new TruncateToAString();
		String expectedOutput="BB";
		//ACT
		String actualOutput;
		actualOutput= t2as.truncateAInFirstTwoPositionString("BB");
		
		//Assert
		assertEquals(expectedOutput,actualOutput);
	}
	@Before
	public void beforeEachJunitTest()
	{
		System.out.println("Inside Before");
	}
	@After
	public void aftefrEachJunitTest()
	{
		System.out.println("Inside After");
	}
	
	@BeforeClass
	public static void beforeJunitTestClass()
	{
		System.out.println("Before Class");
	}
	@AfterClass
	public static void afterJunitTestClass()
	{
		System.out.println("After Class");
	}
	
	@Test(timeout=1)
	public void checkRandom()
	{
		double num[]=new double[100];
		for (int i = 0; i < 100; i++) {
			num[i]=Math.random();
		}
	}
}