package test;

import java.util.Scanner;

public class test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i = 0;
		int j = 0;
		int b = 0;
		int sum = 0;
		Scanner sc = new Scanner(System.in); // 입력 받는 시스템 자원 사용

		for (i = 1; i <= 9; i++) {
			if (i % 2 == 0) {
				continue;
			}
			for (j = 1; j <= 9; j++) {
				System.out.println(i + "*" + j + "=" + i * j);
			}
		}

		System.out.println("==============================");

		for (i = 2; i <= 9; i++) {
			for (j = 1; i >= j; j++) {
				System.out.println(i + "*" + j + "=" + i * j);
			}

		}

		System.out.println("==============================");

		for (i = 1; i <= 5; i++) {
			for (j = 1; i >= j; j++) {
				System.out.print("*");
			}
			System.out.println();

		}

		System.out.println("==============================");

		for (i = 1; i <= 5; i++) {
			for (j = 5; i <= j; j--) {
				System.out.print("*");
			}
			System.out.println();

		}

		System.out.println("==============================");

		for (i = 1; i <= 4; i++) {
			for (b = 4; i <= b; b--) {
				System.out.print(" ");
			}
			for (j = 0; j <= sum; j++) {
				System.out.print("*");
			}
			sum = sum + 2;
			System.out.println();
		}

		System.out.println("==============================");
		// 이부붑 본래 내가 했던 방식 으로 다시 작성해보기
		
//		*******
//		7*****
//		77***
//		777*
		sum = 1 ;
		
		for(i = 1; i <=4 ; i++) {
			for(b = 1 ; b <=i; b++ ) {
				System.out.print(" ");
			}
			for(j=7; j>= sum; j--) {
				System.out.print("*");
			}
			sum = sum + 2;
			System.out.println();
		}
		
//		int sub = 0;
//		
//		for(i = 7; i >= 4 ; i--) { // 반복 횟수 
//			for(j=0; j<i ; j++) {
//				if(j<sub) {
//					System.out.print(" ");
//				}
//				else {
//					System.out.print("*");
//				}
//			}
//			sub++;
//			System.out.println();
//		}
//		
//		System.out.println("==============================");
//		
		// 8. 가위바위보 게임
		
		int win = 0;
		int lose = 0;
		while(true) {
			System.out.println("가위(1), 바위(2), 보(3), 중에 선택해주세요. >>");
			int player = sc.nextInt();
			int computer = (int)(Math.random()*3)+1;
			int result = player - computer;
			String a1 ="";
			if(result == 0) {
				a1 = "비김";
			}else if(result == 2 || result == -1) {
				a1 = "승리";
				win++;
			}else {
				a1 = "패배";
				lose++;
			}
			System.out.println("플레이어"+rockPaper(player)+"VS"+rockPaper(computer)+"컴퓨터 : "+a1);
			System.out.println("승리 : "+win+"/5, 패배 : "+lose);
			if (win>=5) {
				System.out.println("종료");
				break;
			}
		}
	}
	public static String rockPaper(int num) {
		String str = "";
		if (num==1) {
			str = "가위";
		}else if(num==2) {
			str="바위";
		}else {
			str = "보";
		}
		return str;
//			
//		}
	}
}

