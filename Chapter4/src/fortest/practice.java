package fortest;

import java.util.Scanner;

public class practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//윤년 확인 프로그램
		// 윤년의 조건
		// 4로 나누어 떨어지 연도는 윤년입니다.
		// 100로 나누어 떨어지는 연도는 윤년이 아닙니다.
		// 400로 나누어 떨어지는 연도는 윤년입니다.
		Scanner sc = new Scanner(System.in);
		System.out.print("연도를 입력해주세요.>>");
		int year = sc.nextInt();
		
		if(year%400 == 0) {
			System.out.println(year + "년은 윤년 입니다." );
		}else if(year%100 == 0) {
			System.out.println(year + "년은 윤년이 아닙니다." );
		}else if(year%4 == 0) {
			System.out.println(year + "년은 윤년 입니다." );
		}else {
			System.out.println(year + "년은 윤년이 아닙니다." );
		}
		
		if(year%400 == 0 || (year%4 == 0 && year%100 != 0) ) {
			System.out.println(year + "년은 윤년 입니다." );
		}else {
			System.out.println(year + "년은 윤년이 아닙니다." );
		}
		
	}

}










