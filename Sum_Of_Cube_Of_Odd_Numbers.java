package com.tka1_30_Oct2025_Practical_1;

public class Sum_Of_Cube_Of_Odd_Numbers {

	
	public static void main(String[] args) {
		
		int sum = 0;
		
		for(int i = 33; i<=55; i++) {
			
			if(i%2!=0) {
				
				
				sum = sum + i*i*i;
			}
		}
		
		System.out.println("sum of cube of odd numbers :"+sum);
	}
}
