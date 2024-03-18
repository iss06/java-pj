package com.java.practice;

import java.util.Scanner;

public class Ex09 {
	//	태어난 년도를 입력 받습니다.
	//	나이는 생일과 관계없이 계산됩니다. 올해2023년, 2020년생 ➔ 3살 (2023-2020 = 3)
	//	15세미만의 경우와 65세이상인 경우에는 "(나이)살 무료예방접종 대상자 입니다" 메시지를 출력합니다.
	//	이외의 경우에는 " (나이)살 무료예방접종 대상자가 아닙니다" 메시지를 출력합니다.
	
	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		
		int this_year = 2024;
		
		
		System.out.println("태어난 년도를 입력해 주세요.\n년도:");
		
		int birth_year = scanner.nextInt();
		int age = 2024 - birth_year;
		
		if (age < 15 || age >= 65) {
			System.out.println(age + "살" + "무료예방접종 대상자 입니다.");
		} else {
			System.out.println(age + "살" + "무료에방접종 대상자가 아닙니다.");
		}
		
		scanner.close();
	
	}

}
