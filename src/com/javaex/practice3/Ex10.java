package com.javaex.practice3;

import java.util.Scanner;

public class Ex10 {

    public static void main(String[] args) {

        int a = 1;
        int num;
        int output = 0;

        Scanner sc = new Scanner(System.in);

        while(a <= 5) {
            System.out.print("숫자: ");
            num = sc.nextInt();
            
            if (num>output)
            	output = num;
            a++;
        }

        System.out.println("최대값은 " + output + "입니다.");
        sc.close();
	}
    

}
