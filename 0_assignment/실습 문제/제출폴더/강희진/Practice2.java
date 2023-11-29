package practice2;

public class Practice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Q1. 구구단을 짝수단만 출력하도록 프로그램을 만들어 보세요 사용 . (continue )
		for (int i = 2; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				if (i * j % 2 != 0) {
					continue;
				}
				System.out.println(i + "x" + j + "=" + i * j);
			}
		}

		System.out.println();
		System.out.println();
//		Q2.구구단을 단보다 곱하는 수가 작거나 같은 경우까지만 출력하는 프로그램을 만들어 보세요 사용 . (break )
		for (int i = 2; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				if (i <= j) {
					break;
				}
				System.out.println(i + "x" + j + "=" + i * j);
			}

		}

		System.out.println();
//		Q3.3. 반복문을 사용하여 다음 모양을 출력하는 프로그램을 만들어 보세요.
//		*
//		**
//		***
//		****
//		*****
		for (int i = 0; i <= 5; i++) { // 세로로 반복하는 횟수
			for (int j = 0; j < i; j++) { // 가로로 얼마나 반복할 건지

				System.out.print("*");// 가로줄로 입력되도록 print 'ln'은 지우기
			}
			System.out.println(); // 다음 칸에서 입력되도록 엔터 역할
		}

		System.out.println();
		System.out.println();
//		Q4.반복문을 사용하여 다음 모양을 출력하는 프로그램을 만들어 보세요.
//		*****
//		****
//		***
//		**
//		*
		for (int i = 5; i > 0; i--) { // 세로로 반복하는 횟수
			for (int j = 0; j < i; j++) { // 가로로 얼마나 반복할 건지
				System.out.print("*"); // 가로줄로 입력되도록 print 'ln'은 지우기

			}
			System.out.println(); // 다음 칸에서 입력되도록 엔터 역할
		}
		System.out.println();
		System.out.println();
//		Q5. 반복문을 사용하여 다음 모양을 출력하는 프로그램을 만들어 보세요.
//		   *
//		  ***
//		 *****
//		*******
		int space = 3;
		int star = 1;
		for (int i = 4; i < 8; i++) {
			for (int j = 0; j < i; j++) {
				if (j < space) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}

			}
			System.out.println();
			space--;
		}

		System.out.println();
		System.out.println();
//		Q6. 반복문을 사용하여 다음 모양을 출력하는 프로그램을 만들어 보세요.
//		*******
//		 *****
//		  ***
//		   *
		int space2 = 0;
		int star2 = 7;
		for (int i = 7; i > 3; i--) {
			for (int j = 0; j < i; j++) {
				if (j < space2) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			space2++;
			System.out.println();

		}
		System.out.println();
		System.out.println();
//		Q7. 반복문을 사용하여 다음 모양을 출력하는 프로그램을 만들어 보세요. (5번6번 합치면 됨)
//		   *
//		  ***
//		 *****
//		*******
//		 *****
//		  ***
//		   *
		int space3 = 3;
		int star3 = 1;
		for (int i = 4; i < 8; i++) {
			for (int j = 0; j < i; j++) {
				if (j < space3) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}System.out.println();
			space3--;
		}
		int space4 =1;
		int star4=5;
		for(int i=6; i>3; i--) {
			for(int j=0; j<i; j++) {
				if(j<space4) {
					System.out.print(" ");
				}else {
					System.out.print("*");
				}
			}
			space4++;
			System.out.println();
		}
		

		System.out.println();
		System.out.println();
//		Q8. 조건문과 반복문을 이용하여 가위바위보 게임을 만들어보세요.
//		5번을 이겼을 경우 게임이 끝나게 되며 한번 가위바위보를 실행할 때마다 사
//		람과 컴퓨터의 가위바위보 내용 , , , 승패 승리 횟수 패배 횟수를 출력합니다.
//		------- ---------- 실행결과
//		가위 바위 보 중에 (1), (2), (3) 선택해주세요. >> 1
//		플레이어 가위 vs : 바위 컴퓨터 패배
//		승리 패배 : 0/5 , : 1
//		가위 바위 보 , , 중에 선택해주세요 바위 . >>
//		플레이어 바위 vs : 가위 컴퓨터 승리
//		승리 패배 : 1/5 , : 1 

	}
}
