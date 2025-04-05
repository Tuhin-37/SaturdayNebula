
//	Variables in Java
	//Instance OR global variable - Variables declared in Class level, outside method
	//Local variable - variables declared in methods 
	//Static variable - variables belong to class and don't required creating object
	//Method parameter - variables used as method parameter




package com.upskill.java_1;

public class Variables {
	
	public static void main(String[] args){
		
		Variables obj = new Variables();   //className objectName = new className;

		//System.out.println(president);
		//System.out.println(obj.vicePresident);
		
		ny("Chuck");
		
		nj("Cory");
		
	
					
	}
	
	public static String president = "Trump";  //Static varible
	
	public String vicePresident = "Vance";    // Non-Static variable
	
	public static String country = "USA";
	
	public static  String region = "North America";
	
	
	
	
	
	
	public static void ny(String senator){
	
			String city = "Queens";
			String county = "Nassau";
			
			System.out.println(city);
			System.out.println(county);
			System.out.println(country);
			System.out.println(region);
			System.out.println(senator);
	}

	public static void nj(String senator){
		String city = "Bloomfield";
		String county = "Essex";
		
		System.out.println(city);
		System.out.println(county);
		System.out.println(country);
		System.out.println(region);
		System.out.println(senator);
		
	}
	
	public static void ct(String senator){
		String city = "Hartford";
		String county = "Fairfield";
		
		System.out.println(city);
		System.out.println(county);
		System.out.println(country);
		System.out.println(region);
		System.out.println(senator);
		
	}
	
	
}
