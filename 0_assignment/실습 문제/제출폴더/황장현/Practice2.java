package practice2;

import java.util.Scanner;

public class Practice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 문제 1
		for (int i = 2; i < 10; i++) {
			if (i % 2 != 0) {
				continue;
			}
			System.out.println(i + "단");
			for (int j = 1; j < 10; j++) {
				System.out.println(i + " * " + j + " = " + (i * j));
			}
			System.out.println();
		}
		// 문제 2
		for (int i = 2; i < 10; i++) {
			System.out.println(i + "단");
			for (int j = 1; j < 10; j++) {
				if (i < j) {
					break;
				}
				System.out.println(i + " * " + j + " = " + (i * j));
			}
			System.out.println();
		}

		// 문제 3
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();

		// 문제 4
		for (int i = 0; i < 5; i++) {
			for (int j = 5; j > i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}

		// 문제 5
		int i1 = 0;
		int j1 = 0;
		int k1 = 0;
		for (i1 = 1; i1 <= 7; i1 += 2) {
			for (j1 = 5; j1 > k1; j1 -= 2) {
				System.out.print(" ");
			}
			for (k1 = 0; k1 < i1; k1++) {
				System.out.print("*");
			}
			System.out.println();
		}

		// 문제 6
		int i2 = 0;
		int j2 = 0;
		int k2 = 0;
		for (i2 = 7; i2 >= 1; i2 -= 2) {
			for (j2 = 6; j2 > i2; j2 -= 2) {
				System.out.print(" ");
			}
			for (k2 = 0; k2 < i2; k2++) {
				System.out.print("*");
			}
			System.out.println();
		}

		// 문제 7
		int i = 0;
		int j = 0;
		int k = 0;
		for (i = 1; i <= 5; i += 2) {
			for (j = 5; j > k; j -= 2) {
				System.out.print(" ");
			}
			for (k = 0; k < i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (i = 7; i >= 1; i -= 2) {
			for (j = 6; j > i; j -= 2) {
				System.out.print(" ");
			}
			for (k = 0; k < i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		// 문제 8
		Scanner sc = new Scanner(System.in);
		int lose = 0;
		String playerS = "";
		String computerS = "";
		for (int i8 = 0; i8 < 5;) {
			System.out.print("가위(1), 바위(2), 보(3) 중에 선택해주세요. >>> ");
			int player = sc.nextInt();
			int computer = (int) (Math.random() * 3) + 1;
			if (player==1) {
				playerS = "가위";
			}else if (player==2) {
				playerS="바위";
			}else if (player==3) {
				playerS="보";
			}
			if (computer==1) {
				computerS = "가위";
			}else if (computer==2) {
				computerS="바위";
			}else if (computer==3) {
				computerS="보";
			}
			if ((player == 1 && computer == 3) || (player == 2 && computer == 1) || (player == 3 && computer == 2)) {
				System.out.println("플레이어 "+playerS+" vs "+computerS+" 컴퓨터 : 승리");
				i8++;
			}else if ((player==1&&computer==2)||(player==2&&computer==3)||(player==3&&computer==1)) {
				System.out.println("플레이어 "+playerS+" vs "+computerS+" 컴퓨터 : 패배");
				lose++;
			}else {
				System.out.println("플레이어 "+playerS+" vs "+computerS+" 컴퓨터 : 비김");
			}
			System.out.println("승리 : " + i8 + "/5, 패배 : "+lose);
		}
	}
}
