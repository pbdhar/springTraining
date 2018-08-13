package com.cts.junit;


public class TruncateToAString
{
	public String truncateAInFirstTwoPositionString(String str)
	{
		String newStr="";
		String ftchar = str.substring(0, 2);
		String rtchar=str.substring(2);
		newStr=ftchar.replaceAll("A","")+rtchar;
		
		return newStr;

	}
}
