package com.tka1_30_Oct2025_Practical_1;

public class Product_squre_even_number {

	
	public static void main(String[] args) {
		
		long product = 1;
		
		for(int i = 3; i<=12; i++) {
			
			if(i%2==0) {
				
				product = product * (i*i);
			}
		}
		
		System.out.println("product od squres of even numbers is : "+product);
	}
}
