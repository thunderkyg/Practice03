package com.javaex.practice3;

import java.util.Scanner;

public class Ex15 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("숫자를 입력하세요:");
		int num = input.nextInt();
		int factor = 1;
		
		
		while (factor<=num) {
			if (num%factor==0) {
				System.out.println(factor);
			}
			factor++;
		}
		
		input.close();
	}

}