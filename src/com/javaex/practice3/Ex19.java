package com.javaex.practice3;

import java.util.Scanner;

public class Ex19 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		boolean end = true;
		int output = 0;

		while (end) {
			System.out.println("-----------------------------------");
			System.out.println("1. 예금	| 2.출금 | 3.잔고 | 4.종료");
			System.out.println("-----------------------------------");
			System.out.print("선택>");
			int type = input.nextInt();
			if (type == 1) {
				System.out.print("예금액>");
				int positive = input.nextInt();
				output = output + positive;
			} else if (type == 2) {
				System.out.print("출금액>");
				int negative = input.nextInt();
				output = output - negative;
			} else if (type == 3) {
				System.out.println("잔고액>" + output);
			} else if (type == 4) {
				System.out.println("프로그램 종료");
				end = false;
			} else {
				System.out.println("다시입력해주세요");
			}
		}
		input.close();
	}
}
