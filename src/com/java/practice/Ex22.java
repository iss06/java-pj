package com.java.practice;

import java.util.Scanner;

public class Ex22 {
	//	숫자(정수) 3개를 입력 받아 가장 큰 수를 출력하세요.
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("숫자 3개를 입력해주세요.");
		
		System.out.println("숫자1: ");
		int num1 = scanner.nextInt();
		
		System.out.println("숫자2: ");
		int num2 = scanner.nextInt();
		
		System.out.println("숫자3: ");
		int num3 = scanner.nextInt();
		
		int max = num1;
		
		if(max < num2) {
			max = num2;
		}	
		
		if(max < num3) {
			max = num3;
		}
		
		System.out.println("가장 큰수는" + max + "입니다.");
		
		scanner.close();
	}

}
