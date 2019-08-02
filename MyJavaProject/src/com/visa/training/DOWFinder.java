package com.visa.training;

public class DOWFinder {

	public static void main(String[] args) {
		System.out.println(findDOW(01, 03, 1998));

	}
	
	public static String findDOW(int day,int month, int year)
	{
		String dayName[] = {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
		int monthStrength[] = {31,28,31,30,31,30,31,31,30,31,30,31};
		int yearPassed = year-1900;
		int leapYearPassed = (year-1900)/4;
		int daysPassed = 0;
		for(int i=1;i<month;i++)
		{
			daysPassed += monthStrength[i-1];
		}
		if(year%4==0 && month>2)
		{
			daysPassed += 1;
		}
		daysPassed += yearPassed*365 + leapYearPassed + day;
		return dayName[daysPassed%7];
	}

}
