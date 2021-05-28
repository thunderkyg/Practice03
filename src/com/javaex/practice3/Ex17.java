package com.javaex.practice3;

import java.util.Scanner;

public class Ex17 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		System.out.print("숫자를 입력하세요: ");
		
		for (int num = input.nextInt(); num>=1; num--) {
			
			for (int x = 1; x < num; x++) {
				System.out.print("*");

			}
			System.out.println("*");
		}
		input.close();
	}

}
