package com.upskill.java_1;

public class Constructor {
	
	private final String StudentAge = null;
	/*Constructor is instance of class, method same as class name, java will execute constructor first
	 - Constructor can not be static or override nor void or return type.
	 - Default Constructor : No Constructor is initialized.
	 - Parameterized Constructor : Add different signature
	 - Constructor Overloading : Different Signature 
	 */

	
		int studentAge;
		String studentName;
		
		
		public Constructor(int age){
			studentAge = age;
					
		}
				
			public Constructor(int age, String name){
			 studentName = name; 
			 studentAge = age;
		}
		
		public static void main(String[] args) {
			
			Constructor obj = new Constructor(28);
			
			System.out.println("Age  Object 1 : " + obj.studentAge);
			
			Constructor obj2 = new Constructor(25, "Rajesh");
			
					
			System.out.println("Age object 2 : " + obj2.studentAge);
			
			System.out.println("Name object 2 : " + obj2.studentName);
			
			
			Constructor obj3 = new Constructor (24, "Injamam");
			
			System.out.println("Name object 3 : " + obj3.studentName);
			}
		}


