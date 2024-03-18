package com.java.practice;

import java.util.Scanner;

public class Ex16 {
	//	다음과 같이 정의되는 함수의 함수 값을 계산해보자
	
	public static void main(String[] args) {
		
	Scanner scanner = new Scanner(System.in);

	System.out.println("숫자를 입력해 주세요.");
	
	System.out.println("숫자: ");
	int num = scanner.nextInt();
	
	double x = num;
	double result;
	
	if (x <= 0) {
		result = (x * x * x - 9 * x + 2);	
	} else {
		result = (7 * x + 2);
	}
	
	System.out.println("계산결과는 " + result + "입니다.");
	
	scanner.close();
	}

}
