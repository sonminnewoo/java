package practice1;

import java.util.Scanner;

public class Practice10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Scanner scanner = new Scanner(System.in);
		
		System.out.print("음료를 골라주세요 >>");
		String drink = scanner.nextLine();
		
		System.out.print("잔수를 입력해주세요 >>");
		int number = scanner.nextInt();
		
		int price = 0;
		
		
		switch (drink ) {
		case "에스프레소" : price = number * 2000;
		break;
		case "아메리카노" : price = number * 2500;
		break;
		case "카푸치노" : price = number * 3000;
		break;
		case "카페라떼" : price = number * 3500;
		break;
		
		
		default :System.out.println("올바른 음료를 입력해주세요.");
		
		
		
		
		}
		System.out.println(price+"원입니다");
		
		
		
	}

}
