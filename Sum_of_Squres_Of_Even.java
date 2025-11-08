package com.tka1_30_Oct2025_Practical_1;

public class Sum_of_Squres_Of_Even {

	public static void main(String[] args) {
		
		int sum = 0;
		
		for(int i = 33; i<=55; i++) {
			
			if(i%2==0) {
				
				sum = sum + (i*i);
			}
		}
		
		System.out.println("sum of squres of even numbers from 33 to 55"+sum);
	}
}
