package practice2;

import java.util.Scanner;

public class Practice2 {

	public static void main(String[] args) {

//		1.구구단을 짝수단만 출력하도록 프로그램을 만들어 보세요. (continue 사용)
//		짝수단:2,4,6,8단은 출력, 홀수단:1,3,5,7,9단은 continue로 건너뛰기
		for (int i = 2; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				if (i % 2 == 1) {
					continue;
				}
				System.out.println(i + "*" + j + "=" + i * j);

			}
		}

//		2. 구구단을 단보다 곱하는 수가 작거나 같은 경우까지만 출력하는 프로그램
//		을 만들어 보세요. (break 사용)
//		단=i, 곱하는수=j, i>=j 일때만 출력, i=j 졌을때 break 후 다음 단으로 넘어가기
//		(2*1 2*2) (3*1 3*2 3*3) (4*1 ...
		for (int i = 2; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				System.out.println(i + "*" + j + "=" + i * j);
				if (i == j)
					break;
			}
		}

//		3. 반복문을 사용하여 다음 모양을 출력하는 프로그램을 만들어 보세요.
//		*
//		**
//		***
//		****
//		*****
//		맨 왼쪽 *은 i로 i=1시작, 늘어나는*은 j로 j=0 시작
//		첫번째줄은 *1번출력, 두번째줄은 2번출력, ... i와j의 차이가 같은 줄 출력횟수, 밑으로 진행하는 출력횟수는 i
		for (int i = 1; i <= 5; i++) {
			for (int j = 0; i > j; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		System.out.println("");

//		4. 반복문을 사용하여 다음 모양을 출력하는 프로그램을 만들어 보세요.
//		*****
//		****
//		***
//		**
//		*	
//		첫번째 줄 출력땐 i와j의 차이가 5부터 시작
		for (int i = 1; i <= 5; i++) {
			for (int j = 6; i < j; j--) {
				System.out.print("*");
			}
			System.out.println("");
		}

//		5. 반복문을 사용하여 다음 모양을 출력하는 프로그램을 만들어 보세요.
//		   *
//		  ***
//		 *****
//		*******
// 		칸 띄우기 반복출력 후 *반복출력 후 줄바꿈
		for (int i = 1; i < 5; i++) {
			// 띄우기 출력 3칸, 2칸, 1칸, 0칸
			for (int j = 4; i < j; j--) {
				System.out.print(" ");
			}
			// *출력 1개, 3개, 5개, 7개
			for (int j = 1; j <= 2*i-1; j++) {

				System.out.print("*");
			}
			System.out.println("");
		}
		System.out.println("");

//		6. 반복문을 사용하여 다음 모양을 출력하는 프로그램을 만들어 보세요
//		 *******
//		  *****
//		   ***
//		    *
		for (int i = 1; i < 5; i++) {
			// 띄우기 출력 0칸, 1칸, 2칸, 3칸
			for (int j = 1; i > j; j++) {
				System.out.print(" ");
			}
			// *출력 7개, 5개, 3개, 2개, 1개
			for (int j = 8; j > 2*i-1; j--) {
				System.out.print("*");
			}
			System.out.println("");
		}
		System.out.println("");

//		7. 반복문을 사용하여 다음 모양을 출력하는 프로그램을 만들어 보세요.
//		     *
//		    ***
//		   *****
//		  *******
//		   *****
//		    ***
//		     *
		// *7개까지 문제5번처럼 진행  
		for (int i = 1; i < 5; i++) {
			for (int j = 4; i < j; j--) {
				System.out.print(" ");
			}
			for (int j = 1; j <= 2*i-1; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		for (int i = 1; i < 4; i++) {
			// 띄우기 출력 1칸, 2칸, 3칸
			for (int j = 0; i > j; j++) {
				System.out.print(" ");
			}
			// *출력 5개, 3개, 1개
			for (int j = 6; j > 2*i-1; j--) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
//		8. 조건문과 반복문을 이용하여 가위바위보 게임을 만들어보세요.
//		5번을 이겼을 경우 게임이 끝나게 되며 한번 가위바위보를 실행할 때마다 사
//		람과 컴퓨터의 가위바위보 내용 ,승패, 승리 횟수, 패배 횟수를 출력합니다.
//		-------실행결과----------
//		가위(1), 바위(2), 보(3) 중에 선택해주세요. >> 1
//		플레이어 가위 vs 바위 컴퓨터 : 패배
//		승리 : 0/5 , 패배 : 1
//		가위, 바위, 보 중에 선택해주세요. >> 바위
//		플레이어 바위 vs 가위 컴퓨터 : 승리
//		승리 : 1/5 , 패배 : 1
//		이겼을때 win+=1, 졌을때 lose+=1
//
		Scanner sc = new Scanner(System.in);
		int lose = 0;
		for(int win=0; win<5; ) {
			System.out.print("가위(1),"+ "바위(2),"+ "보(3)"+ " 중에 선택해주세요. >>");
			int player = sc.nextInt();
			int computer = (int)(Math.random()*3 )+1;
			if( player == 1) {
				if(computer == 1) {
					System.out.println("플레이어 가위" +" vs "+ "가위 컴퓨터"+ " : 무승부");
				} else if(computer == 2) {
					lose+=1;
					System.out.println("플레이어 가위" +" vs "+ "바위 컴퓨터"+ " : 패배");
				} else if(computer == 3){
					win+=1;
					System.out.println("플레이어 가위" +" vs "+ "보 컴퓨터"+ " : 승리");
				}	
				
			}if( player == 2) {
				if(computer == 2) {
					System.out.println("플레이어 바위" +" vs "+ "바위 컴퓨터"+ " : 무승부");
				} else if(computer == 3) {
					lose+=1;
					System.out.println("플레이어 바위" +" vs "+ "보 컴퓨터"+ " : 패배");
				} else if(computer == 1){
					win+=1;
					System.out.println("플레이어 바위" +" vs "+ "가위 컴퓨터"+ " : 승리");
				}
				
			}if( player == 3) {
				if(computer == 3) {
					System.out.println("플레이어 보" +" vs "+ "보 컴퓨터"+ " : 무승부");
				} else if(computer == 1) {
					lose+=1;
					System.out.println("플레이어 보" +" vs "+ "가위 컴퓨터"+ " : 패배");
				} else if(computer == 2){
					win+=1;
					System.out.println("플레이어 보" +" vs "+ "바위 컴퓨터"+ " : 승리");
				}
				
			} 		System.out.println("승리:"+win+"/5"+","+"패배 :"+ lose);
		}			System.out.println("-가위바위보 게임이 종료되었습니다-");
		
	}
}
		
		
		
		
