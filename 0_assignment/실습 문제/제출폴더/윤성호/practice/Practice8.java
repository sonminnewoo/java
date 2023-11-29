package practice;

import java.util.Scanner;

public class Practice8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 가위,바위,보 게임 만들기
		// 가위 : 1   바위 : 2  보 : 3
		Scanner sc = new Scanner(System.in);
		System.out.print("가위 : 1   바위 : 2  보 : 3 중에 하나를 선택 해주세요 >>>");
		int c =0;
		int ac= 0;
		while(c<=5) {
			
			int player = sc.nextInt();
			int computer = (int)(Math.random() * 3 +1) ;
		// math.random ---> 0.1 ~~~ 1.0 까지의 수1 
			int result = player - computer;
		// 0 : 비김
		// -2 , 1 , 1
		// 그 외
			if(result == 0) {
			System.out.println("플레이어 : " + player + " vs 컴퓨터 : " + computer);
			System.out.println("비겼습니다.");
			}else if(result == -2 || result == 1) {
			System.out.println("플레이어 : " + player + " vs 컴퓨터 : " + computer);
			System.out.println("이겼습니다.");
			
			}else {
			System.out.println("플레이어 : " + player + " vs 컴퓨터 : " + computer);
			System.out.println("졌습니다.");
			}
			if(result == 0)
			System.out.println("승리" + c + "/5" + "       패배"+ ac );
			else if(result == -2 || result == 1) {
			System.out.println("승리" + (c++ +1)  + "/5" + "       패배"+ ac );
			}else {
			System.out.println("승리" + c + "/5" + "       패배"+ ac++ );
			}
			if(c>=5) {
				break;
			}
		}
		System.out.println("경기가 종료 되었습니다.");
	}
}