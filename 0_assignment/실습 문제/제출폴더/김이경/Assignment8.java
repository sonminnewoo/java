package hello;

import java.util.Scanner;

public class Assignment8 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("음료수의 종류와 잔 수를 입력하세요. >>");
		String coffee = sc.next();
		int num = sc.nextInt();

		int cost = 0;
		switch (coffee) {
		case "에스프레소":
			if (coffee.equals("에스프레소"))
			cost = num * 2000;
			
		case "아메리카노":
			if (coffee.equals("아메리카노"))
			cost = num * 2500;
			
		case "카푸치노":
			if (coffee.equals("카푸치노"))
			cost = num * 3000;
			
		case "카페라떼":
			if (coffee.equals("카페라떼"))
			cost = num * 3500;
			
		default:
			break;

		}

		System.out.println(coffee + num + " 잔은 " + cost +"원 입니다." );
		
		
	}
}
