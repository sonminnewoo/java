package javaproject;

import java.util.Scanner;

public class JavaAssignment001 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
	        System.out.println("문제 번호를 입력하세요 >>");
	        if (sc.hasNextInt()) {
	            int choice = sc.nextInt();
	            switch (choice) {
	                case 1: question01(); break;
	                case 2: question02(); break;
	                case 3: question03(); break;
	                case 4: question04(); break;
	                case 5: question05(); break;
	                case 6: question06(); break;
	                case 7: question07(); break;
	                case 8: question08(); break;
	                default: System.out.println("다시 입력하세요."); continue;
	            }
            }
            break;
		}
		sc.close();
	}
	
	private static void question01() {
        // 1. 두 정수를 입력받아 합을 구하여 출력하는 프로그램을 작성하라. 키보드 입력은 Scanner 클래스를 이용하라.
		Scanner sc1 = new Scanner(System.in);
		System.out.println("두 정수를 입력하세요(띄어쓰기로 구분)>>");
		int a = sc1.nextInt();
		int b = sc1.nextInt();
		int sum = a + b;
		System.out.println(sum);
		sc1.close();
	}
	private static void question02() {
        // 2. 한 층의 높이가 5m일 때, 건물이 몇 층인지 입력받아 높이를 출력하라.
		Scanner sc2 = new Scanner(System.in);
		System.out.println("몇 층인지 입력하세요>>");
		int floor = sc2.nextInt();
		int high = floor * 5;
		System.out.println(high);
		sc2.close();
	}
	private static void question03() {
        // 3. x 값을 입력받아 y=x^2-3x+7 식을 계산하여 y값을 출력하는 프로그램을 작성하라.
		Scanner sc3 = new Scanner(System.in);
		System.out.println("x 값을 입력하세요>>");
		int x = sc3.nextInt();
		int y = (int) (Math.pow(x, 2) - 3 * x + 7);
		System.out.println("x=" + x + ", y=" + y);
		sc3.close();
	}
	private static void question04() {
        // 4. 문제가 없음.
		System.out.println("4번 문제가 없습니다.");
	}
	private static void question05() {
        /* 5. 다음과 같이 AND 와 OR의 논리 연산을 입력받아 결과를 출력하는 프로그램을 작성하라.
         *    'true AND false = false', 'true OR false = true'
         *    if 문 대신 switch문을 이용하라. 										*/
		Scanner sc5 = new Scanner(System.in);
		System.out.println("논리 연산을 입력하세요(띄어쓰기로 구분)>>");
		boolean firstValue = sc5.nextBoolean();
		String operation = sc5.next();
		boolean secondValue = sc5.nextBoolean();
		boolean result = false;
		switch (operation.toUpperCase()) {
			case "AND": result = firstValue && secondValue; break;
			case "OR": result = firstValue || secondValue; break;
			default : System.out.println("잘못된 연산입니다.");  //**잘못된 값을 입력하면 에러코드가 뜨는데 해결법을 잘 모르겠음.
		}
		System.out.println(result);
		sc5.close();
	}
	private static void question06() {
        // 1.돈의 액수를 입력받아 오만원권, 만원권, 천원권, 500원짜리 동전, 100원짜리 동전, 10원짜리 동전, 1원짜리 동전 각 몇 개로 변환되는지 출력하라.
		Scanner sc6 = new Scanner(System.in);
		System.out.println("돈의 액수를 입력하세요>>");
		int money = sc6.nextInt();
		int [] currency = {50000, 10000, 5000, 1000, 500, 100, 50, 10, 1};
		String[] name = {"오만원권", "만원권", "오천원권", "천원권", "500원", "100원", "50원", "10원", "1원"};
		for (int i = 0; i < currency.length; i++) {
	        int count = money / currency[i];
	        money %= currency[i];
	        System.out.println(name[i] + count + "개");
	    }
        sc6.close();
	}
	private static void question07() {
        // 7. 학점이 A, B이면 "Excellent", 학점이 C, D이면 "Good", 학점이 F이면 "Bye" 라고 출력하는 프로그램을 작성하라. switch와 break를 활용.
		Scanner sc7 = new Scanner(System.in);
		System.out.println("학점을 입력하세요>>");
		String grade = sc7.next();
		switch (grade) {
			case "A" : case "B" : System.out.println("Excellent"); break;
			case "C" : case "D" : System.out.println("Good"); break;
			case "F" : System.out.println("Bye"); break;
            default:
                System.out.println("잘못된 학점입니다.");
		}
        sc7.close();
	}
	private static void question08() {
        // 1.음료수 종류와 잔 수를 입력받으면 가격을 알려주는 프로그램을 작성하라.
		// 에스프레소 2000원 아메리카노 2500원 카푸치노 3000원 카페라떼 3500원이다.
		Scanner sc8 = new Scanner(System.in);
		System.out.println("커피 주문하세요>>");
		String coffee = sc8.next();
		int count = sc8.nextInt();

        int price = 0;
        // (1) if문을 활용하라.
        if (coffee.equals("에스프레소")) {
            price = 2000;
        } else if (coffee.equals("아메리카노")) {
            price = 2500;
        } else if (coffee.equals("카푸치노")) {
            price = 3000;
        } else if (coffee.equals("카페라떼")) {
            price = 3500;
        } else {
            System.out.println("잘못 입력하였습니다.");
        }

        int totalIf = price * count;
        System.out.println(totalIf + "원입니다.(IF문)");
        
        // (2) switch문을 활용하라.
        switch (coffee) {
        case "에스프레소": price = 2000; break;
        case "아메리카노": price = 2500; break;
        case "카푸치노": price = 3000; break;
        case "카페라떼": price = 3500; break;
        default:
            System.out.println("잘못 입력하였습니다.");
        }

        int totalSwitch = price * count;
        System.out.println(totalSwitch + "원입니다.(switch문)");
        sc8.close();
	}  
}