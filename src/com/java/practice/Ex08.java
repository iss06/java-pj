package com.java.practice;

import java.util.Scanner;

public class Ex08 {
	//	사용자로 키와 몸무게를 입력 받아 BMI을 계산한 후에 저체중, 정상체중, 과체중을 구분하여 출력하는
	//	프로그램을 작성하세요. (정상체중의 범위는 18.5 <= BMI <= 24.9)
	public static void main(String[] args) {
		
		double bmi;
		int tall;
		int weight;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("키와 몸무게를 입력해 주십시오.\n키:\n몸무게:");
		bmi = scanner.nextInt();
		tall = scanner.nextInt();
		weight = scanner.nextInt();
		
		if (bmi >= 18.5) {
			if (bmi <= 24.9) {
				System.out.println("정상체중입니다.");
				
			}
		}
		
		
	}

}
