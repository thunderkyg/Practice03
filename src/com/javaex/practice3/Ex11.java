package com.javaex.practice3;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("숫자를 입력하세요");

		int num = input.nextInt();
		int b = 0;
		int c = 1;
		int output = 0;

		while (num >= b && num >= c) {
			if (num % 2 == 0) {
				output = output + b;
				b = b + 2;
			} else {
				output = output + c;
				c = c + 2;
			}
		}
		System.out.println("결과값: " + output);
		input.close();

	}

}
