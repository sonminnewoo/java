package switchtest;

import java.util.Scanner;

public class SwitchTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 5층 건물의 층수를 받아 어떤층인 알려주는 프로그램
		// 1층 : 약국 ,2층 : 정형외과, 3층 : 피부과, 4층 : 치과, 5층 : 헬스 클럽
		Scanner sc = new Scanner(System.in);
		System.out.print("층수 입력 >>");
		int floor = sc.nextInt();
		String store = "없는층";
		switch (floor) {
		case 1:
			store = "약국";
			break;
		case 2:
			store = "정형외과";
			break;
		case 3:
			store = "피부과";
			break;
		case 4:
			store = "치과";
			break;
		case 5:
			store = "헬스 클럽";
			break;

		}
		System.out.println(floor + "층은 "+ store + " 입니다.");

	}

}








