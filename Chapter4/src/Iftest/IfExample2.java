package Iftest;

import java.util.Scanner;

public class IfExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 입장료 계산 프로그램 만들기
		// 나이를 기준으로 8살 이하는 1000원
		// 14살 이하는 2000원
		// 20살 이하는 2500원
		// 그 외는 4000원
		// ctrl + shift + o : 자동 임포트 단축키
		System.out.print("나이를 입력해주세요 >>");
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		int cost = 0;
		if(age<=8) {
			cost = 1000;
		}else if(age<=14) {
			cost = 2000;
		}else if(age<=20) {
			cost = 2500;
		}else {
			cost = 4000;
		}
		System.out.println("입장료는 " + cost+cost + "원 입니다.");
	}

}









