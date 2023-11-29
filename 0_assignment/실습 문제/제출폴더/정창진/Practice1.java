package practice;

import java.util.Scanner;

public class Practice1 {

	public static void main(String[] args) {
		
//		1. 두 정수를 입력받아 합을 구하여 출력하는 프로그램을 작성하라. 키보드 입력은 Scanner 
//		클래스를 이용하라. [난이도 하]
//		두 정수를 입력하세요>>10 20
//		10+20은 30
//		Scanner sc = new Scanner(System.in);
//		System.out.print("두 정수를 입력하세요>>");
//		int a = sc.nextInt();
//		int b = sc.nextInt();
//		System.out.println(a+"+"+b+"은 "+(a+b));

//		2. 한 층의 높이가 5m일 때, 건물이 몇 층인지 입력받아 높이를 출력하라. [난이도 하]
//				몇 층인지 입력하세요>>155
//				775m 입니다.
//		System.out.print("몇 층인지 입력하세요>>");
//		int floor = sc.nextInt();
//		System.out.println(floor*5+"m 입니다.");
		
//		3. x 값을 입력받아 y = x²-3x+7 식을 계산하여 y 값을 출력하는 프로그램을 작성하라.
//				[난이도 하]
//				x 값을 입력하세요>>5
//				x=5, y=17
//		System.out.print("x 값을 입력하세요>>");
//		int x = sc.nextInt();
//		int y = (x*x)-(3*x)+7;
//		System.out.println("x="+x+","+"y="+y);
		
//		5.다음과 같이 AND와 OR의 논리 연산을 입력받아 결과를 출력하는 프로그램을 작성하라. 
//		예를 들어 ‘true AND false’의 결과로 false를, ‘true OR false’의 결과로 true를 출력하면 된
//		다. if문 대신 switch문을 이용하라. [난이도 중]
//		논리 연산을 입력하세요>>true OR false
//		true
//		System.out.print("논리 연산을 입력하세요>>");
//		boolean b1 = sc.nextBoolean();
//		String op = sc.next();
//		boolean b2 = sc.nextBoolean();
//		
//		switch(op) {
//			case "And" : 
//				System.out.println(b1 && b2);
//				break;
//			case "Or" :
//				System.out.println(b1 || b2);
//				break;
//		}

//		6. 돈의 액수를 입력받아 오만원권, 만원권, 천원권, 500원짜리 동전, 100원짜리 동전, 10원
//		짜리 동전, 1원짜리 동전 각 몇 개로 변환되는지 출력하라. 힌트 참조. [난이도 중]
//		돈의 액수를 입력하세요>>65245
//		오만원1개, 만원1개, 천원5개, 500원0개, 100원2개, 10원4개, 1원5개
//		System.out.print("돈의 액수를 입력하세요>>");
//		int money = sc.nextInt();
//		int m1 = money/50000;
//		money = money%50000; 
//		int m2 = money/10000;
//		money = money%10000; 
//		int m3 = money/1000;
//		money = money%1000; 
//		int m4 = money/500;
//		money = money%500; 
//		int m5 = money/100;
//		money = money%100; 
//		int m6 = money/10;
//		money = money%10; 
//		int m7 = money/1;
//		money = money%1;
//		System.out.println("오만원"+m1+"개, "+"만원"+m2+"개, "+"천원"+m3+"개, "+"500원"+m4+"개, "+"100원"
//		+m5+"개, "+"10원"+m6+"개, "+"1원"+m7+"개");
		
//		7. 학점이 A, B이면 “Excellent”, 학점이 C, D이면 “Good”, 학점이 F이면 “Bye”라고 출력하
//		는 프로그램을 작성하라. switch와 break를 활용 [난이도 중]
//		학점을 입력하세요>>B
//		Excellent
//		System.out.print("학점을 입력하세요>>");
//		String grade = sc.next();
//		switch(grade) {
//		case "A" : case "B" :
//			System.out.println("Excellent");
//			break;
//		case "C" : case "D" :
//			System.out.println("Good");
//			break;
//		case "F" :
//			System.out.println("Bye");
//		}
		
//		8. 음료수 종류와 잔 수를 입력받으면 가격을 알려주는 프로그램을 작성하라. 에스프레소
//		는 2000원, 아메리카노 2500원, 카푸치노 3000원, 카페라떼 3500원이다. [난이도 중]
//		커피 주문하세요>>카푸치노 3
//		9000원입니다.
//		(1) if문을 활용하라.
//		(2) switch문을 활용하라.
//		(if문)
//		System.out.print("커피 주문하세요>>");
//		String cof = sc.next();
//		int count = sc.nextInt();
//		int total = 0;
//		if(cof.equals("에스프레소")) {
//			total = (2000*count);
//		}else if(cof.equals("아메리카노")) {
//			total = (2500*count);
//		}else if(cof.equals("카푸치노")) {
//			total = (3000*count);
//		}else if(cof.equals("카페라떼")){
//				total = (3500*count);
//			}
//		System.out.println(total+"원입니다.");
//		(switch문)	
//		System.out.print("커피 주문하세요>>");
//		String cof = sc.next();
//		int count = sc.nextInt();
//		int total = 0;
//		switch(cof) {
//		case "에스프레소":
//			total = (2000*count);
//			break;
//		case "아메리카노":
//			total = (2500*count);
//			break;
//		case "카푸치노":
//			total = (3000*count);
//			break;
//		case "카페라떼":
//			total = (3500*count);
//			break;
//		} 		System.out.println(total+"원입니다.");
	}

}
