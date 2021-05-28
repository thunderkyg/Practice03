package com.javaex.practice3;

import java.util.Scanner;

public class Ex18 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		System.out.print("숫자를 입력하세요: ");
		int num = input.nextInt();
		
		for (int i = num; i>=1; i--) {
			
			for (int x = 1; x < i; x++) {
				System.out.print("*");
			}
			System.out.println("*");
			
			
			if(i==1) {
				for (i = 1; i<num; i++) {
					for (int y = 1; y<=i; y++) {
					System.out.print("*");}
					System.out.println("*");
				}
				if (i==num) {break;}
			}
			
		}
		input.close();
	}

}
