package com.upskill.java_1;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;

public class Array_Hashpmap_Hashset_HashTable {
	
	public static void main(String [] args) {
		
		//Array Store Multiple using Index
		
		int age = 28;									//Variable
		int[] ageNebula = new int[]{21, 24, 31, 28, 29}; //Array
		
		//Array index 				[0] [1] [3] [4]
		
		System.out.println("Student Age :" +ageNebula[3]);
		System.out.println("Student Age :" +ageNebula.length);
	
		String [] nameNebula = new String[] {"Injamam", "Tuhin", "Mazid", "Goutam", "Pascaleen"};
		//Array index 		[0] [1] [3] [4]
		System.out.println("Student Name :" +nameNebula[1]);
		System.out.println("Total Student Name: "+nameNebula.length);
		
		//Multi-Dimensional Array
		
		int [] [] ageNebula2D = {{21, 24, 31, 28, 29}, //[0][0] [0][1] [0][2] [0][3] [0][4]
								  {22, 26, 32}}; 	  // [1][0] [1][1] [1][2]
		
		System.out.println("Student Age 2D: " + ageNebula2D[0][3]);
		
		HashMap<String, Integer> Student = new HashMap<String, Integer>();
		
		Student.put("Rajesh", 21);
		Student.put("Majid", 25);
		Student.put("Pascaleen", 23);
		Student.put("Sana", 24);
		Student.put("Injamam", 25);
		
		System.out.println("Hashmap Student Age : " + Student.get("Majid"));
		
		HashMap<String, String> CapitalName = new HashMap<String, String>();
		CapitalName.put("Bangladesh", "Dhaka");
		CapitalName.put("India", "New Delhi");
		CapitalName.put("Pakistan", "Islamabad");
		CapitalName.put("Maldives", "Male");
		
		System.out.println("Hashmap Capital Name: " + CapitalName.get("Maldives"));
		
		//HashTable store multiple data using key-value pair, No Duplicates, also is Synchronized (only one thread can be modified)
		
		Hashtable<String, String> Region = new Hashtable<String, String>();
		
		Region.put("BD", "Asia");
		Region.put("USA", "America");
//		Region.put("null", "null");
		
		System.out.println("Region : " + Region.get("BD"));
		
		
		//Hashset store unordered collection of unique value, Implementation of Set interface
		
		HashSet<String> car = new  HashSet<String>();
		
		car.add("Ferrari");
		car.add("Audi");
		car.add("Tesla");
		car.add("Ford");
		
		System.out.println("Car : " + car);
	}

}


