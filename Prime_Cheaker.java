package com.tka1_30_Oct2025_Practical_1;

import java.util.Scanner;

public class Prime_Cheaker {

	public static void main(String[] args) {
		
		System.out.println("enter a number : ");
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		int count = 0;
		
		if(num <= 1) {
			
			System.out.println(num+"is not prime number.");
		}
		
		else {
			
			for(int i = 2; i<=num/2; i++) {
				
				if(num % i == 0) {
					
					count++;
					break;
				}
			}
			
			if(count == 0) {
				
				System.out.println(num+"is prime number.");
			}
			
			else {
				
				System.out.println(num+"is not prime number");
			}
		}
		sc.close();
		
	}
}
