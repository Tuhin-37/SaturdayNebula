package com.upskill.java_1;

public class MethodType {
	
	/* 	Types of Methods
	 
	1.Void Method
	2.Static Method
	3.Return Type Method  
 */
	
	public static void main(String[] args) {
		
		MethodType obj = new MethodType();
		
		obj.annualIncomeVoid();
		weeklyIncomeStatic();
		
		System.out.println("My Montly Income = " + obj.monthlyIncomeReturn());
		
	}
	
	
	public static int hourlyIncome = 60;
	
	public  void annualIncomeVoid(){
		
		int calculateAnnualIncome = hourlyIncome * 2000;
		System.out.println("My Annual Income = " + calculateAnnualIncome);
	}
	
	public int monthlyIncomeReturn(){
		
		int calculateMonthlyIncome = hourlyIncome *180;
		return calculateMonthlyIncome; 
	}
	
	public String test(){
		String name = "Rasel";
		return name;
	}
	
	public static void weeklyIncomeStatic(){
		
		int calculateWeeklyIncome = hourlyIncome * 40;
		System.out.println("My Weekly Income = " + calculateWeeklyIncome);
	}
	
}
