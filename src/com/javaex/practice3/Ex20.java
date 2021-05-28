package com.javaex.practice3;

import java.util.Scanner;

public class Ex20 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int answer = 29;
		boolean first = true;
		boolean second = true;		

		while (first) {
			
			System.out.println("=====================");
			System.out.println("숫자맞추기 게임 시작");
			System.out.println("=====================");

			second = true;

			while (second) {
				System.out.print(">>");
				int num = input.nextInt();
				
				if (num > answer) {
					System.out.println("더 낮게");
				} else if (num < answer) {
					System.out.println("더 높게");
				} else {
					System.out.println("맞았습니다.");
					System.out.print("게임을 종료하시겠습니까? (Y/N)");
					char y = input.next().charAt(0);
					input.nextLine();
					
					if (y == 'y') {
						System.out.println("=====================");
						System.out.println("숫자맞추기게임 종료");
						System.out.println("=====================");
						first = false;
						break;
					} else {
						second = false;
					}
				}
			}

		}
		input.close();
	}

}