package switchtest;

import java.util.Scanner;

public class SwitchTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1~12월 까지의 일수를 출력하는 프로그램 작성하기
		// 1,3,5,7,8,10,12 = 31일
		// 4,6,9,11 = 30일
		// 2 = 28일
		Scanner sc = new Scanner(System.in);
		System.out.print("월을 입력해주세요 >>");
		int month = sc.nextInt();
		int days = 0; 
		switch(month) {
			case 1:case 3:case 5:case 7:case 8:case 10:case 12:
				days = 31;
				break;
			case 4 : case 6 : case 9 : case 11 :
				days = 30;
				break;
			case 2:
				days = 28;
				break;
			default : 
				days = 0;
		}
		System.out.println(month + "월은 " + days + "일 입니다.");
		
		if(month==1 || month==3 || month==5 || month==7 || month==8 || month==10 || month==12) {
			days = 31;
		}else if(month==4 || month==6 || month==9 || month==11) {
			days = 30;
		}else if(month == 2) {
			days = 28;
		}else {
			days = 0;
		}
	}

}













