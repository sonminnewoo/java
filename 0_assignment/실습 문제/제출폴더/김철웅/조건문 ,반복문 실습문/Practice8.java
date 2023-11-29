package practice;

import java.util.Random;
import java.util.Scanner;

public class Practice8 {

	
	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        Random random = new Random();
	        int userWins = 0;
	        int computerWins = 0;
	        int roundsToWin = 5;

	        System.out.println("가위바위보 게임을 시작합니다. 먼저 " + roundsToWin + "번 이기면 게임이 종료됩니다.");

	        while (userWins < roundsToWin && computerWins < roundsToWin) {
	            System.out.print("가위(1), 바위(2), 보(3): ");
	            int userChoice = scanner.nextInt();

	            if (userChoice < 1 || userChoice > 3) {
	                System.out.println("올바른 선택이 아닙니다. 1, 2, 3 중에서 선택하세요.");
	                continue;
	            }

	            int computerChoice = random.nextInt(3) + 1;

	            System.out.println("사용자: " + getUserChoiceString(userChoice));
	            System.out.println("컴퓨터: " + getUserChoiceString(computerChoice));

	            if (userChoice == computerChoice) {
	                System.out.println("비겼습니다!");
	            } else if ((userChoice == 1 && computerChoice == 3) || (userChoice == 2 && computerChoice == 1) || (userChoice == 3 && computerChoice == 2)) {
	                System.out.println("사용자 승리!");
	                userWins++;
	            } else {
	                System.out.println("컴퓨터 승리!");
	                computerWins++;
	            }

	            System.out.println("현재 스코어: 사용자 " + userWins + " - " + computerWins + " 컴퓨터");
	        }

	        if (userWins == roundsToWin) {
	            System.out.println("게임 종료. 사용자 승리!");
	        } else {
	            System.out.println("게임 종료. 컴퓨터 승리!");
	        }
	    }

	    public static String getUserChoiceString(int choice) {
	        switch (choice) {
	            case 1:
	                return "가위";
	            case 2:
	                return "바위";
	            case 3:
	                return "보";
	            default:
	                return "알 수 없음";
	        }
	    }
	

	
	
}
