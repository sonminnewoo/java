package practicing;

import java.util.Scanner;

public class Practicing2 {

	public static void main(String[] args) {
		
		// 1. 구구단 짝수만 출력
		for (int i = 2; i < 10; i++) {
			if (i % 2 != 0) {
				continue;
			}
			System.out.println(i + "단");
			for (int j = 1; j <= 9; j++) {
				System.out.println(i + "*" + j + "=" + i * j);
			}
		}
//		for (int i = 2; i < 10; i+=2)
//			System.out.println(1 + "단");
//		for (int j = 1; j <= 9; j++) {
//			System.out.println(i + "*" + j + "=" + i * j);
		System.out.println("----------------");
		// 2 .구구단을 단보다 곱하는 수가 작거나 같은 경우까지만 출력
		for (int a = 2; a < 10; a++) {
			System.out.println(a + "단");
			for (int b = 1; b <= 9; b++) {
				if (b > a)
					break;
				System.out.println(a + "*" + b + "=" + a * b);
			}
		}
		System.out.println("----------------");
		// 3. 반복문을 사용해서 모양 출력
		for (int c = 0; c < 5; c++) {
			for (int d = 0; d <= c; d++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("----------------");
		// 4 .반복문을 사용해서 모양 출력
		for (int e = 5; e > 0; e--) {
			for (int f = 0; f < e; f++) {
				System.out.print("*");
			}
			System.out.println();
		
		}
		System.out.println("----------------");
		// 5. 반복문을 사용해서 모양 출력 피라미드 모양
		int sub = 3;
		for (int i=4; i<=7; i++) {
			for(int j=0; j<i; j++) {
				if(j<sub) {
					System.out.println(" ");
				}else {
					System.out.print("*");
				}
			}
			sub--;
			System.out.println();
		}
			System.out.println("----------------");
		// 6. 반복문을 사용해서 모양 출력 역피라미드
			sub=0;
			for (int i = 7; i>=4; i--) {
				for (int j=0; j<i; j++) {
					if(j<sub) {
						System.out.print(" ");
					}else {
						System.out.print("*");
					}
				}
				sub++;
				System.out.println();
			}
			System.out.println("----------------");
		// 7. 반복문을 사용해서 모양 출력
			sub = 3;
			for (int i=4; i<=6; i++) {
				for(int j=0; j<i; j++) {
					if(j<sub) {
						System.out.println(" ");
					}else {
						System.out.print("*");
					}
				}
				sub--;
				System.out.println();
			}
			sub=0;
			for (int i = 7; i>=4; i--) {
				for (int j=0; j<i; j++) {
					if(j<sub) {
						System.out.print(" ");
					}else {
						System.out.print("*");
					}
				}
				sub++;
				System.out.println();
			}
		System.out.println("----------------");
		// 8. 가위바위보 게임
		Scanner sc = new Scanner(System.in);
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
	}
}

