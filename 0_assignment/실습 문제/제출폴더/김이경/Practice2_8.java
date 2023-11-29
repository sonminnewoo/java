package practice2;

import java.util.Scanner;

public class Practice2_8 {
	public static void main(String[] args) {

		/*
		 * 8. 조건문과 반복문을 이용하여 가위바위보 게임을 만들어보세요. 5번을 이겼을 경우 게임이 끝나게 되며 한번 가위바위보를 실행할 때마다
		 * 사람과 컴퓨터의 가위바위보 내용 , , , 승패 승리 횟수 패배 횟수를 출력합니다. ------- ---------- 실행결과 가위 바위
		 * 보중에 (1), (2), (3) 선택해주세요. >> 1 플레이어 가위 vs : 바위 컴퓨터 패배 승리/패배 : 0/5 , 1 가위 바위 보
		 * , , 중에 선택해주세요 바위 . >\ > 플레이어 바위 vs : 가위 컴퓨터 승리 승리 패배 : 1/5 , : 1
		 */
		final int SCISSORS = 1;
		final int ROCK = 2;
		final int PAPER = 3;

		Scanner sc = new Scanner(System.in);
		
		
		int playerWin = 0;
		int computerWin = 0;
		while (playerWin <= 5) {
			System.out.println("가위 바위 보중에 (1), (2), (3) 선택해주세요.>>");
			
			int player = sc.nextInt();
			int computer = (int) (Math.random() * 3) + 1;
			System.out.println("-------실행 결과 -------------------------");
			// 플레이어 가위 vs : 바위 컴퓨터 패배
			System.out.println("플레이어: " + player + "컴퓨터: " + computer);

			switch (player) {
			case SCISSORS:
				if (computer == SCISSORS) {
					System.out.println("비김");
				} else if (computer == ROCK) {
					System.out.println("컴퓨터가 이김");
					computerWin++;
				} else if (computer == PAPER) {
					System.out.println("플레이어 승리");
					playerWin++;
				} 
				
				break;

			case ROCK:	
					if (computer == ROCK) {
						System.out.println("비김");
					} else if (computer == PAPER) {
						System.out.println("컴퓨터가 이김");
						computerWin++;
					} else if (computer == SCISSORS) {
						System.out.println("플레이어 승리");
						playerWin++;
				}
				break;

			case PAPER:
					if (computer == PAPER) {
						System.out.println("비김");
					} else if (computer == SCISSORS) {
						System.out.println("컴퓨터가 이김");
						computerWin++;
					} else if (computer == ROCK) {
						System.out.println("플레이어 승리");
						playerWin++;
				}
				break;

			}
			System.out.println("플레이어가 이긴 횟수:" + playerWin);
			

			}
	}

		}
	
	
