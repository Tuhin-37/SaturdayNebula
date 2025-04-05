package com.upskill.java_1;

public class IfElseStatement {

	public static void main(String[] args) {
		
		int age = 100;
		if(age<=13){
			System.out.println("You're Children");
		} else if(age>13 && age<18){
			System.out.println("You're Teenager");
		} else if(age>60){
			if (age>=100){
				System.out.println("You're a Champion");
			} else { 
			System.out.println("You're Senior");
			}
		} else {
			System.out.println("You are adult");
		}
			
	}

}
	
	
	

