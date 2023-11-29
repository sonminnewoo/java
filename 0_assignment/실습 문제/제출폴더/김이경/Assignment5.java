package hello;

import java.util.Scanner;

public class Assignment5 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
* 다음과 같이 AND와 OR의 논리 연산을 입력받아 결과를 출력하는 프로그램을 작성하라. 예를 들어 ‘true AND false’의 결과로
* false를, ‘true OR false’의 결과로 true를 출력하면 된 다. if문 대신 switch문을 이용하라. [난이도 중] 논리
* 연산을 입력하세요>>true OR false true 힌트)다음과 같이 키보드에서 3개의 토큰을 읽고 switch와 case를 구성하면
* 된다. boolean a = scanner.nextBoolean(); // 첫 번째 논리 값 읽기 String op =
* scanner.next(); // 논리 연산자(AND 또는 OR)를 문자열로 읽기 boolean b =
* scanner.nextBoolean(); // 두 번째 논리 값 읽기 switch(op) { case “AND”: … }* 
		
		 */
	
		Scanner sc = new Scanner(System.in);
		System.out.print("논리 연산을 입력하세요>>");
		
		boolean a = sc.nextBoolean();
		String op = sc.next();
		boolean b = sc.nextBoolean();

		switch (op) {
		case "AND":
			System.out.println(a&&b);
			break;
		case "OR":
			System.out.println(a||b);
			break;

		default:
			System.out.println("잘못된 입력입니다.");
			break;
		
		
		}
		
		
		
		
		

	}
}
