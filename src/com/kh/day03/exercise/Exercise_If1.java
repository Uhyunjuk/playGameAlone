package com.kh.day03.exercise;

import java.util.Scanner;

public class Exercise_If1 {
	public static void main(String[] args) {
		// 정수 하나를 입력받아서 양의정수인지 0인지 음의정수인지
		// 판별하는 프로그램을 작성하시오.

		Scanner sc = new Scanner(System.in);

		System.out.print("정수 하나를 입력해주세요 : ");
		int input = sc.nextInt();
		String result = ""; // 변수 초기화 (이렇게하면 밑에 프린트하나하나 안적어도됨)

		if (input > 0) {
			result = "양의 정수";
		} else if (input == 0) {
			result = "0";
		} else {
			result = "음의 정수";
		}
		System.out.println(input + "은/는 " + result + "입니다.");
		
		sc.close();
	}
}
