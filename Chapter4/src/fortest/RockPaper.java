package fortest;

import java.util.Scanner;

public class RockPaper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 가위바위보 게임 만들기
		// 가위:1, 바위:2, 보:3
		Scanner sc = new Scanner(System.in);
		System.out.println("가위:1, 바위:2, 보:3 중에 하나를 선택해주세요.>>");
		int player = sc.nextInt();
		int computer = (int)(Math.random() * 3) + 1;
		if(player == 1 ) {
			if(computer == 1) {
				System.out.println("비겼습니다.");
			}else if(computer == 2) {
				System.out.println("졌습니다.");
			}else if(computer == 3) {
				System.out.println("이겼습니다.");
			}
			
		}else if(player == 2) {
			if(computer == 1) {
				System.out.println("이겼습니다.");
			}else if(computer == 2) {
				System.out.println("비겼습니다.");
			}else if(computer == 3) {
				System.out.println("졌습니다.");
			}
		}else if(player == 3){
			if(computer == 1) {
				System.out.println("졌습니다.");
			}else if(computer == 2) {
				System.out.println("이겼습니다.");
			}else if(computer == 3) {
				System.out.println("비겼습니다.");
			}
		}
		
		if(player == computer) {
			System.out.println("비겼습니다.");
		}else if(player == 1 && computer == 3
				|| player == 2 && computer == 1
				||player == 3 && computer == 2) {
			System.out.println("이겼습니다.");
		}else {
			System.out.println("졌습니다.");
		}
		
		int result = player - computer;
		// 0 : 비겼을때
		// -2 , 1 : 이겼을 때
		// 2 , -1 : 졌을 때
		if(result == 0) {
			System.out.println("비겼습니다.");
		}else if(result == -2 || result == 1) {
			System.out.println("이겼습니다.");
		}else {
			System.out.println("졌습니다.");
		}
	}

}








