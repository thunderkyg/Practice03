package com.javaex.practice3;

public class Ex01 {

	public static void main(String[] args) {
		System.out.println("while 문");
		int index = 0;
		while (index<3) {
			System.out.println("index=" + index);
			index++;
		}
		
		System.out.println("for 문");
		for (int order = 0; order < 3; order++) {
			System.out.println("order=" + index);
		}

	}

}