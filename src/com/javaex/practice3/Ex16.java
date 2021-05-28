package com.javaex.practice3;

import java.util.Scanner;

public class Ex16 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		/* 5의 배수가 아닌 % -> 0 인 코드. WRONG
		System.out.print("숫자를 입력하세요: ");
		int num = input.nextInt();
		int factor = 1;
		int a = 0;
		int sum = 0;

		while (factor <= num) {
			if (num % factor == 0) {
				a = a + 1;
				sum = sum + factor;
			}
			factor++;
		}
		System.out.println("5의배수의 개수: " + a);
		System.out.println("5의배수의 합:" + sum);
		input.close();
		*/
		// ** 합 부분이 마음에 안들어 다시 한번 검토 !!! 
		System.out.print("숫자를 입력하세요: ");
		int num = input.nextInt();
		int factor = 1;
		int a = 0;
		int sum = 0;
		
		while (factor <= num) {
			
			if (factor%5==0) {
			a = a + 1;
			sum = sum + (5*a);
			}
			
			factor++;
		}
		System.out.println("5의배수의 개수: " + a);
		System.out.println("5의배수의 합:" + sum);
		input.close();
	}
}