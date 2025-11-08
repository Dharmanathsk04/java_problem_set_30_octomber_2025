package com.tka1_30_Oct2025_Practical_1;

import java.util.Scanner;

public class Print_Prime_Number {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter start number :");
		int start = sc.nextInt();
		
		System.out.println("Enter end number :");
		int end = sc.nextInt();
		
		
		System.out.println("prime numbers between"+start+"and"+end+"are:");
		
		
		for(int i = start; i<=end;i++) {
			
			if(i>1) {
				
				boolean prime = true;
				
				for(int j = 2; j<=i/2; j++) {
					
					if(i%j == 0) {
						
						prime = false;
						break;
					}
				}
				
				if(prime) {
					
					System.out.println(i+" ");
				}
			}
			
			sc.close();
		}
	}
}
