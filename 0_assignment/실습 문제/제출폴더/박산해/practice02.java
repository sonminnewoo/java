package practice;

import java.util.Scanner;

public class practice02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Q1
	 /*     for(int i=1; i<=9; i++) {
			if(i%2==0) {
			 System.out.println(i+"단");
			 for(int j=1; j<=9; j++) {
					  System.out.println((i + "*" + j +"="+i*j));
					  continue;
			 }
			}
		 }    */
		
		
		//Q2
	 /*      for(int i=1; i<=9; i++) {
			 System.out.println(i+"단");
			 for(int j=1; j<=9; j++) {
					  System.out.println((i + "*" + j +"="+i*j));
					  if(i<=j) {
					  break;
				 }
		}
		 }     */
		    
	
		//Q3
	/*	for(int i=0; i<5; i++) {
			 for(int j=0; j<=i; j++) {
					  System.out.print("*");
			}
			 System.out.println(); 
		}  */
		
		
		//Q4
	/*	for(int i=5; i>0; i--) {
			 for(int j=0; j<i; j++) {
					  System.out.print("*");
			}
			 System.out.println(); 
		} */
		
		//Q5
	/*	for(int i=1; i<8; i+=2) {
			for(int j =7; j>i; j-=2) {
				System.out.print(" ");
			}
		for(int j = 0; j<i; j++) {
			System.out.print("*");
		}
		System.out.println();
		} */
		
		
		//Q6
	/*	for(int i=1; i<10; i+=2) {
			for(int j =1; j<i; j+=2) {
				System.out.print(" ");
			}
		for(int j = 8; j>i; j--) {
			System.out.print("*");
		}
		System.out.println();
		}  */
		
		
		//Q7
	/*	for(int i=1; i<7; i+=2) {
			for(int j =8; j>i; j-=2) {
				System.out.print(" ");
			}
		for(int j = 0; j<i; j++) {
			System.out.print("*");
		}
		System.out.println();
		}  
		for(int i=1; i<8; i+=2) {
			for(int j =0; j<i; j+=2) {
				System.out.print(" ");
			}
		for(int j = 8; j>i; j--) {
			System.out.print("*");
		}
		System.out.println();
		}  */
		
		
		//Q8
	/*	Scanner sc = new Scanner(System.in);
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
		}  */
	}
}