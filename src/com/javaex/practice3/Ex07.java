package com.javaex.practice3;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("숫자를 입력하세요");
		int num = sc.nextInt();
		
		for (int i = 1;  i <= num; i ++) {
			
			for (int x = 1; x <= i; x ++  ){
				System.out.print(i);
			}
			System.out.println("");
		}
		
		sc.close();
	}

}
