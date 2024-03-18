package com.java.practice;

import java.util.Scanner;

public class Ex13 {
	//	두 개의 정수를 입력 받은 후에 작은 수가 큰 수의 약수인지 확인하는 프로그램을 작성하세요.
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("첫번째 숫자: ");
		int num1 = scanner.nextInt();
		
		System.out.println("두번째 숫자: ");
		int num2 = scanner.nextInt();
		
		int large, small;
		
		if (num1 > num2) {
			large = num1;
			small = num2;
		} else {
		 	large = num2;
			small = num1;
	    }	
		
		if (large % small == 0) {
			System.out.println(small + "는(은)" + large + "의 약수입니다.");
		} else {
			System.out.println(small + "는(은)" + large + "의 약수가 아닙니다.");
		}
		
		scanner.close();
		
	}
}