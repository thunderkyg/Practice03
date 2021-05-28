package com.javaex.practice3;

import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("숫자를 입력하세요");
		int num = input.nextInt();
		int output = 0;

		for (int a = 1; a <= num; a++) {
			output = output + a;
		}
		
		System.out.println("결과값: " + output);
		
		input.close();

	}

}