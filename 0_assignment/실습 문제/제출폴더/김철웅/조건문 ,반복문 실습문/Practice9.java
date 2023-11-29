package practice1;

import java.util.Scanner;

public class Practice9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("음료를 골라주세요 >>");
		String drink = scanner.nextLine();
		
		System.out.print("잔수를 입력해주세요 >>");
		int number = scanner.nextInt();
		
		int price = 0;
		if (drink.equals("에스프레소")) {
			price = 2000 * number ;
			
		}
		else if (drink.equals("아메리카노") ) {
			
			price = 2500 * number ;
		}
		
		else if (drink.equals("카푸치노") ) {

			price = 3000 * number ;
			
		}
		
		else if ( drink.equals("카페라떼")) {
			
			price = 3500 * number ;
		}
		else {System.out.println("잘못된 입력입니다");}
		
		
		System.out.println(price+"원입니다");
		
		
		
		
		
		
		
		}
		
	}


