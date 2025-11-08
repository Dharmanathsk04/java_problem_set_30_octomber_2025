package com.tka1_30_Oct2025_Practical_1;

public class Sum_Of_Cubes_Of_Even {

	public static void main(String[] args) {
		
		int sum = 0;
		
		for(int i = 33; i<=55; i++) {
			
			if(i%2==0) {
				
				sum = sum + i*i*i;
			}
		}
		
		System.out.println("sum of cubes of even numbers : "+sum);
	}
}
