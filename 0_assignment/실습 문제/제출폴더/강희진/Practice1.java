package practice2;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthScrollBarUI;

public class Practice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Q1-1.
		Scanner sc = new Scanner(System.in);
		System.out.print("두 정수를 입력하세요>>");
		int x = sc.nextInt();
		int y = sc.nextInt();
		int sum = x + y;
		System.out.println(x + "+" + y + "은 " + sum);

//Q1-2.
		Scanner sc2 = new Scanner(System.in);
		System.out.print("몇 층인지 입력하세요>>");
		int x2 = sc2.nextInt();
		int mult = x2 * 5;
		System.out.println(mult + "m 입니다.");
//Q1-3.
		Scanner sc3 = new Scanner(System.in);
		System.out.print("x 값을 입력하세요>>");
		int x3 = sc3.nextInt();
		int y3 = (x * x) - (3 * x) + 7;
		System.out.println("x=" + x + ", " + "y= " + y3);

//Q1-5.
		Scanner sc5 = new Scanner(System.in);
		System.out.print("논리 연산을 입력하세요>>");

//Q1-6.
		Scanner sc6 = new Scanner(System.in);
		System.out.print("돈의 액수를 입력하세요>>");
		int n = sc6.nextInt();
		
		

//Q1-7.
		Scanner sc7 = new Scanner(System.in);
		System.out.print("학점을 입력하세요>>");
		String Score = sc7.nextLine();
		String result7;
		switch (Score) {
		case "A":
		case "B":
			result7 = "Excellent";
			break;
		case "c":
		case "D":
			result7 = "Good";
			break;
		default:
			result7 = "Bye";
			break;
		}
		System.out.println(result7);

//Q1-8.
		Scanner sc8 = new Scanner(System.in);
		System.out.print("커피 주문하세요>>");
		String coffee = sc8.nextLine();
		int ct = sc.nextInt();
		int cost = 0;
		if(coffee.equals("에스프레소")) {
			cost=2000;
		}else if(coffee.equals("아메리카노")) {
			cost=2500;
		}else if(coffee.equals("카푸치노")) {
			cost=3000;
		}else if(coffee.equals("카페라떼")){
			cost=3500;
		}System.out.println(cost*ct + "원 입니다.");
	}
}