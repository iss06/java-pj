package com.java.practice;

import java.util.Scanner;

public class Ex12 {
	//	숫자(정수) 3개를 입력받아 가장 작은 수를 출력하세요
	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("숫자 3개를 입력해주세요.\n");
		
		System.out.println("숫자1: ");
		int num1 = scanner.nextInt();
		
		System.out.println("숫자2: ");
		int num2 = scanner.nextInt();
		
		System.out.println("숫자3: ");
		int num3 = scanner.nextInt();
	
		int min = num1;
		
		if (min > num2) {
			min = num2;
		}
		
		if (min > num3) {
			min = num3;
		}
		
		System.out.println("가장 작은수는 " + min + "입니다.");
			
		scanner.close();
		
	}


}