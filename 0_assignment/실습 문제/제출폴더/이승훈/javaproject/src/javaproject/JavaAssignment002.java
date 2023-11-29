package javaproject;

import java.util.Scanner;

public class JavaAssignment002 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
	        System.out.println("문제 번호를 입력하세요 >>");
	        if (sc.hasNextInt()) {
	            int choice = sc.nextInt();
	            switch (choice) {
	                case 1: question01(); break;
	                case 2: question02(); break;
	                case 3: question03(); break;
	                case 4: question04(); break;
	                case 5: question05(); break;
	                case 6: question06(); break;
	                case 7: question07(); break;
	                case 8: question08(); break;
	                default: System.out.println("다시 입력하세요."); continue;
	            }
            }
            break;
		}
		sc.close();
	}
	
	private static void question01() {
        // 1. 구구단을 짝수단만 출력하도록 프로그램을 만들어 보세요. (continue 사용)
        for (int dan = 2; dan <= 9; dan++) {
        	if (dan % 2 != 0) {
        		continue;
        	}
            System.out.println(dan + "단");
            for (int i = 1; i <= 9; i++) {
            	if (i % 2 != 0) {
            		continue;
            	}
                System.out.println(dan + " x " + i + " = " + (dan * i));
            }
            System.out.println(); // 한 칸 띄움
    	}
    }
	private static void question02() {
        // 2. 구구단을 단보다 곱하는 수가 작거나 같은 경우까지만 출력하는 프로그램을 만들어 보세요. (break 사용)
        for (int dan = 2; dan <= 9; dan++) {
            System.out.println(dan + "단");
            for (int i = 1; i <= 9; i++) {
                System.out.println(dan + " x " + i + " = " + (dan * i));
            	if (dan == i) {
            		break;
            		}
            	}
            	System.out.println();
            }
	}
	private static void question03() {
        // 3. 반복문을 사용하여 다음 모양을 출력하는 프로그램을 만들어 보세요.
		for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
		}
	}
	private static void question04() {
        // 4. 반복문을 사용하여 다음 모양을 출력하는 프로그램을 만들어 보세요.
		for (int i = 1; i <= 5; i++) {
            for (int j = 5; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println();
		}		
	}
	private static void question05() {
        // 5. 반복문을 사용하여 다음 모양을 출력하는 프로그램을 만들어 보세요.
        int n = 4;
		for (int i = 1; i <= n; i++) {
            for (int k = n; k > i; k--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
		}
	}
	private static void question06() {
        // 6. 반복문을 사용하여 다음 모양을 출력하는 프로그램을 만들어 보세요.
        int n = 4;
		for (int i = 1; i <= n; i++) {
            for (int k = 1; k < i; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * (n - i) + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
		}		
	}
	private static void question07() {
        // 7. 반복문을 사용하여 다음 모양을 출력하는 프로그램을 만들어 보세요.
        int n = 4;
		for (int i = 1; i <= 2 * n - 1; i++) {
            int spaces = Math.abs(n - i);
            int stars = 2 * n - 1 - 2 * spaces;
            for (int j = 0; j < spaces; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < stars; k++) {
                System.out.print("*");
            }

            // 줄 바꿈
            System.out.println();
		}
	}
	private static void question08() {
        /* 8. 조건문과 반복문을 사용하여 가위바위보 게임을 만들어 보세요.
         *    5번을 이겼을 경우 게임이 끝나게 되며 한번 가위바위보를 실행할 때마다 사람과 컴퓨터의
         *    가위바위보 내용, 승패, 승리 횟수, 패배 횟수를 출력합니다. */
		
			// 컴퓨터와 플레이어의 승리 횟수에 대한 각 변수를 지정한다.
	        int playerWins = 0; // 플레이어 승리 횟수
	        int computerWins = 0; // 컴퓨터 승리 횟수

	        Scanner sc8 = new Scanner(System.in);
	        // while 문을 통해 플레이어 승리 횟수가 5회보다 적으면 가위바위보를 반복하도록 한다.
	        while (playerWins < 5) {
	        	// 플레이어의 선택을 결정한다.
	            System.out.print("가위(1), 바위(2), 보(3) 중에 선택해주세요. >> ");
	            int playerChoice = sc8.nextInt();
	            // 플레이어가 잘못 선택하면 최초 선택으로 되돌아간다.
	            if (playerChoice < 1 || playerChoice > 3) {
	                System.out.println("올바른 선택이 아닙니다. 다시 선택하세요.");
	                continue;
	            }
	            //컴퓨터의 선택을 결정한다.
	            int computerChoice = (int) (Math.random() * 3) + 1;
	            // 플레이어 선택, 컴퓨터의 선택에 따라 가위바위보를 실행하는 함수 RockPaper를 지정하고, RockPaper에서 출력된 변수를 result에 저장한다.
	            String result = RockPaper(playerChoice, computerChoice);
	            //result가 승리 혹은 패배일 경우 각각 플레이어의 승리 횟수, 컴퓨터의 승리 횟수가 증가한다.
	            if (result.equals("승리")) {
	                playerWins++;
	            } else if (result.equals("패배")) {
	                computerWins++;
	            }
	            // 가위바위보 실행결과를 출력한다. 결과 출력을 위해 playerChoice, computerChoice 값(1,2,3)에 따라 가위, 바위, 보를 출력하는 함수 print를 지정한다.
	            System.out.print("플레이어 ");
	            print(playerChoice);
	            System.out.print(" vs ");
	            print(computerChoice);
	            System.out.print(" 컴퓨터");
	            System.out.println(" : " + result);
	            System.out.println("승리 : " + playerWins + "/" + 5 + " , 패배 : " + computerWins);
	        } //while 반복문 종료
	        //플레이어가 5회 승리했으므로 여기서 가위바위보가 종료된다.
	        System.out.println("게임 종료!");
	        sc8.close();
	    }
	    private static void print(int choice) {
	    	//Choice 값(1,2,3)에 따라 "가위", "바위", "보"를 출력하는 함수
	        switch (choice) {
	            case 1:
	                System.out.print("가위");
	                break;
	            case 2:
	                System.out.print("바위");
	                break;
	            case 3:
	                System.out.print("보");
	                break;
	        }
	    }
	    private static String RockPaper(int playerChoice, int computerChoice) {
	    	//playerChoice, computerChoice 에 따라 가위바위보를 실시하고 결과를 출력하는 함수
	        if ((playerChoice == 1 && computerChoice == 3) || 
	            (playerChoice == 2 && computerChoice == 1) || 
	            (playerChoice == 3 && computerChoice == 2)) {
	            return "승리";
	        } else if (playerChoice == computerChoice) {
	            return "무승부";
	        } else {
	            return "패배";
	        }
	    }
}