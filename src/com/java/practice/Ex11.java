package com.java.practice;

import java.util.Scanner;

public class Ex11 {
	//	두 개의 정수를 입력 받아 큰 수를 작은 수로 나눈 몫과 나머지를 출력하는 프로그램을 작성하세요.
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		
		
		
		
		System.out.println("첫번째 숫자: \n두번째 숫자: ");
		
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		
		int large, small;
		
		if (num1 > num2) {
			large = num1;
			small = num2;
		} else  {
			large = num2;
			small = num1;

		
		int a = large / small;
		int b = large & small;
		
		System.out.println("몫: " + a);
		System.out.println("나머지: "+ b);
		
	}

		scanner.close();
}
	
}