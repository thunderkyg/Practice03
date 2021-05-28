package com.javaex.practice3;

public class Ex08 {

	public static void main(String[] args) {

		for (int a = 1; a <= 9; a++) {
			for (int b = 2; b <= 9; b++) {
				int sum = a*b;
				System.out.print(b + "*"+ a + "=" + sum + "	");
			}
			System.out.println("");
		}

	}

}
