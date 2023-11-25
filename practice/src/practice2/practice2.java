package practice2;

import java.util.Scanner;

public class practice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Q1
		for (int i = 2; i <= 9; i += 2) {
			System.out.println(i + "단");
			for (int j = 1; j <= 9; j++) {
				System.out.println(i + "*" + j + "=" + i * j);
			}
		}
		for (int i = 2; i <= 9; i += 2) {
			if(i%2 == 0) {
				System.out.println(i + "단");
				for (int j = 1; j <= 9; j++) {
					System.out.println(i + "*" + j + "=" + i * j);
				}
			}
		}
		for (int i = 2; i <= 9; i += 2) {
			if(i%2 != 0) {
				continue;
			}
			System.out.println(i + "단");
			for (int j = 1; j <= 9; j++) {
				System.out.println(i + "*" + j + "=" + i * j);
			}
		}
		System.out.println();
		// Q2
		for (int i = 2; i <= 9; i++) {
			System.out.println(i + "단");
			for (int j = 1; j <= 9; j++) {
				if(j>i) {
					break;
				}
				System.out.println(i + "*" + j + "=" + i * j);
			}
		}
		for (int i = 2; i <= 9; i++) {
			System.out.println(i + "단");
			for (int j = 1; j <= i; j++) {
				System.out.println(i + "*" + j + "=" + i * j);
			}
		}
		//Q3
		for (int i=0; i<5; i++) {
			for (int j=0; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		//Q4
		for (int i=5; i>0; i--) {
			for (int j=0; j<i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		//Q5
		int sub = 3;
		for(int i=4; i<=7; i++) {
			for(int j=0; j<i; j++) {
				if(j<sub) {
					System.out.print(" ");
				}else {
					System.out.print("*");
				}
			}
			sub--;
			System.out.println();
		}
		System.out.println();
		//6
		sub = 0;
		for(int i=7; i>=4; i--) {
			for(int j=0; j<i; j++) {
				if(j<sub) {
					System.out.print(" ");
				}else {
					System.out.print("*");
				}
			}
			sub++;
			System.out.println();
		}
		//7
		sub = 3;
		for(int i=4; i<=6; i++) {
			for(int j=0; j<i; j++) {
				if(j<sub) {
					System.out.print(" ");
				}else {
					System.out.print("*");
				}
			}
			sub--;
			System.out.println();
		}
		sub = 0;
		for(int i=7; i>=4; i--) {
			for(int j=0; j<i; j++) {
				if(j<sub) {
					System.out.print(" ");
				}else {
					System.out.print("*");
				}
			}
			sub++;
			System.out.println();
		}
		//8
		Scanner sc = new Scanner(System.in);
		int win = 0;
		int lose = 0;
		while(true) {
			System.out.print("가위(1), 바위(2), 보(3) 중에 선택해주세요>>");
			int player = sc.nextInt();
			int computer = (int)(Math.random()*3)+1;
			int result = player - computer;
			String a1 = "";
			
			if(result == 0) {
				a1 = "비김";
			}else if(result == -2 || result == 1) {
				a1 = "승리";
				win++;
			}else {
				a1 = "패배";
				lose++;
			}
			System.out.println("플레이어" + rockPaper(player) 
								+ " vs " + rockPaper(computer)+" 컴퓨터 : " + a1 );
			System.out.println("승리 : "+win+"/5, 패배 : "+lose);
			if(win>=5) {
				System.out.println("종료");
				break;
			}
		}
	}
	public static String rockPaper(int num) {
		String str = "";
		if(num ==1) {
			str = "가위";
		}else if(num == 2) {
			str = "바위";
		}else {
			str = "보";
		}
		return str;
	}
}











