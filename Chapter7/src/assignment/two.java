package assignment;

import java.util.Scanner;

public class two {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		
		if (0<i || i<100) {
			if(i==3||i==6||i==9) {
				System.out.println("박수짝");
			} else if(i==3&&i==6 || i==3&&i==9 ||i==6&&i==9) {
				System.out.println("박수짝짝");
			}
		} else {
			System.out.println("입력은 1~99 까지 입니다 . 다시 실행해주세요 ");
		}
	}

}
