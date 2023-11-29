package practice2;

import java.util.Scanner;

public class practice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Q1
//		for(int i=2; i<=9; i++) {
//			if(i%2 == 1) {
//				continue;
//			}
//			for(int j=1; j<=9; j++) {
		// System.out.println(i+"*"+j+"="+i*j);
//			}
//		}
		// Q2
//		for(int i=2; i<=9; i++) {
//			for(int j=1; j<=9; j++) {
//				if(i < j) {
//					break;
//				}
//				System.out.println(i+"*"+j+"="+i*j);
//			}
//		}
		// Q3
//		for (int i = 0; i< 5; i++) {
//			for(int j = 0; j<=i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		// Q4
//		for (int i=5; i>0; i--) {
//			for(int j=0; j<i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		// Q5
//		int space = 3;
	//	int star = 1;
	//	for (int i = 4; i < 8; i++) {
	//		for (int j = 0; j < i; j++) {
	//			if (j < space) {
		//			System.out.print(" ");
		//		} else {
			//		System.out.print("*");
		//		}
	//		}
		//	System.out.println();
	//		space--;
		//}
		
//		Q6
//		int space2 = 0;
//		int star2 = 7;
//		for (int i=7; i>3; i--) {
//			for (int j= 0; j<i; j++) {
//				if(j<space2) {
//					System.out.print(" ");
//				}else {
//					System.out.print("*");
//				}
//			}
//			space2++;
//			System.out.println();
//		}
		
//		Q7
//		int space = 3;
//			int star = 1;
//			for (int i = 4; i < 7; i++) {
//				for (int j = 0; j < i; j++) {
//				if (j < space) {
//						System.out.print(" ");
//					} else {
//						System.out.print("*");
//					}
//			}
//				System.out.println();
	//			space--;
//			}
//		int space2 = 0;
	//	for (int i=7; i>3; i--) {
//			for (int j= 0; j<i; j++) {
//				if(j<space2) {
//					System.out.print(" ");
//				}else {
//				System.out.print("*");
//			}
//			}
//			space2++;
//			System.out.println();
//		}
		
		
//		Q8
		Scanner sc = new Scanner(System.in);
		System.out.println("가위, 바위, 보 중에 선택해 주세요.");
		int win = 0;
		int lose = 0;
		while(true) {
			System.out.print("가위(1), 바위(2), 보(3) 중에 선택해 주세요>>");
			int player = sc.nextInt();
			int computer = (int)(Math.random()*3)+1;
			int result = player - computer;
			String a1 = "";
			if(result ==0) {
				a1 = "비김";
			}else if(result == -2 || result == 1) {
				a1 = "승리";
				win++;
			}else {
				a1 = "패배";
				lose++;
			}
			System.out.println("플레이어" + rockPaper(player) + " vs " + rockPaper(computer)+" 컴퓨터 : " +a1);
			System.out.println("승리 : "+win+"/5, 패배 : "+lose);
			if(win>=5) {
				System.out.println("종료");
				break;
			}
		}
	}
	public static String rockPaper(int num) {
		String str = "";
		if(num==1) {
			str = "가위";
		}else if(num==2) {
			str = "바위";
		}else {
			str ="보";
		}
		return str;
	
	}
}
