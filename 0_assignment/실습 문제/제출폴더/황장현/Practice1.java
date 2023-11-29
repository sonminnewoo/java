package practice1;

import java.util.Scanner;

public class Practice1 {

	public static void main(String[] args) {
		// 문제1
		Scanner sc1 = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		System.out.print("첫번째 정수를 입력하세요 >>> ");
		int num1 = sc1.nextInt();
		System.out.print("두번째 정수를 입력하세요 >>> ");
		int num2 = sc2.nextInt();
		System.out.println(num1 + " + " + num2 + "은 " + (num1 + num2));

		// 문제2
		Scanner sc3 = new Scanner(System.in);
		System.out.print("몇 층인지 입력하세요 >>> ");
		int floor = sc3.nextInt();
		System.out.println((floor * 5) + "m 입니다.");

		// 문제3
		Scanner sc4 = new Scanner(System.in);
		System.out.print("x 값을 입력하세요 >>> ");
		int x = sc4.nextInt();
		System.out.println("x=" + x + ", y=" + ((x * x) - (3 * x) + 7));

		// 문제5
		Scanner sc5 = new Scanner(System.in);
		System.out.print("논리 연산을 입력하세요 >>> ");
		boolean a = sc5.nextBoolean();
		String op = sc5.next();
		boolean b = sc5.nextBoolean();
		switch (op) {
		case "AND":
			if (a && b == true) {
				System.out.println(true);
			} else {
				System.out.println(false);
			}
			break;
		case "OR":
			if (a || b == true) {
				System.out.println(true);
			} else {
				System.out.println(false);
			}
			break;
		}

		// 문제6
		Scanner sc6 = new Scanner(System.in);
		System.out.print("돈의 액수를 입력하세요 >>> ");
		int n = sc6.nextInt();
		int div50k = n / 50000;
		int div50kr = n % 50000;
		int div10k = div50kr / 10000;
		int div10kr = div50kr % 10000;
		int div1k = div10kr / 1000;
		int div1kr = div10kr % 1000;
		int div500 = div1kr / 500;
		int div500r = div1kr % 500;
		int div100 = div500r / 100;
		int div100r = div500r % 100;
		int div10 = div100r / 10;
		int div10r = div100r % 10;
		int div1 = div10r / 1;
		System.out.println("오만원 " + div50k + "개, 만원 " + div10k + "개, 천원 " + div1k + "개, 오백원 " + div500 + "개, 백원 "
				+ div100 + "개, 십원 " + div10 + "개, 일원 " + div1 + "개");

		// 문제 7
		Scanner sc7 = new Scanner(System.in);
		System.out.print("학점을 입력하세요 >>> ");
		String grade = sc7.next();
		switch (grade) {
		case "A":
		case "B":
			System.out.println("Excellent");
			break;
		case "C":
		case "D":
			System.out.println("Good");
			break;
		case "F":
			System.out.println("Bye");
		}

		// 문제 8
		Scanner sc8 = new Scanner(System.in);
		System.out.print("커피 주문하세요 >>> ");
		String coffee = sc8.next();
		Scanner sc9 = new Scanner(System.in);
		System.out.print("잔 수를 입력하세요 >>> ");
		int cupNum = sc9.nextInt();
		// if문 활용
		if (coffee.equals("에스프레소")) {
			System.out.println(2000 * cupNum + "원입니다.");
		} else if (coffee.equals("아메리카노")) {
			System.out.println(2500 * cupNum + "원입니다.");
		} else if (coffee.equals("카푸치노")) {
			System.out.println(3000 * cupNum + "원입니다.");
		} else if (coffee.equals("카페라떼")) {
			System.out.println(3500 * cupNum + "원입니다.");
		}
		// swtich문 활용
		switch (coffee) {
		case "에스프레소":
			System.out.println(2000 * cupNum + "원입니다.");
			break;
		case "아메리카노":
			System.out.println(2500 * cupNum + "원입니다.");
			break;
		case "카푸치노":
			System.out.println(3000 * cupNum + "원입니다.");
			break;
		case "카페라떼":
			System.out.println(3500 * cupNum + "원입니다.");
			break;
		}

	}
}