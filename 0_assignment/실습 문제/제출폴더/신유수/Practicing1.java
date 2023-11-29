package practicing;
import java.util.Scanner;
public class Practicing1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. 두 정수를 입력받아 합을 구하여 출력
		Scanner sc = new Scanner(System.in);
		System.out.print("두 정수를 입력하세요 >>> ");
		// 10 띄우고 20 하면 두 정수 들어감
		int a1 = sc.nextInt();
		int a2 = sc.nextInt();
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a1 + " + " + a2 + "은 " + (a1 + a2));
		
		// 2. 한 층의 높이가 5m일 때, 건물이 몇 층인지 입력받아 높이를 출력
		System.out.print("몇 층인지 입력하세요 >> ");
		int b1 = sc.nextInt();
		System.out.println((b1 * 5) + "m 입니다.");
		
		// 3. y = x²-3x+7
		System.out.print("x의 값을 입력하세요 >> ");
		int x = sc.nextInt();
		int y = (x*x)-(3*x)+7;
		System.out.println("x=" + x + ", y=" + y);
		
		// 5. AND와 OR의 논리 연산
		System.out.print("논리 연산을 입력하세요 >> ");
		boolean a = sc.nextBoolean();
		String op = sc.next();
		boolean b = sc.nextBoolean();
		switch (op) {
		case "AND":
			System.out.println(a && b);
			break;
		case "OR":
			System.out.println(a || b);
			break;
		}
		
		// 6.
		System.out.println("돈의 액수를 입력하세요. >>");
		int money = sc.nextInt();
		int m1 = money/50000;
		money = money%50000; //15245
		int m2 = money/10000;
		money = money%10000; //5245
		int m3 = money/1000;
		money = money%1000; //245
		int m4 = money/500;
		money = money%500; //245
		int m5 = money/100;
		money = money%100; //45
		int m6 = money/10;
		money = money%10; //5
		int m7 = money/1;
		money = money%1; //0
		System.out.println("오만원"+m1+"개, 만원"+m2+"개, 천원"+m3+"개, 500원"
				+m4+"개, 100원"+m5+"개, 10원"+m6+"개, 1원"+m7+"개");
		
		// 7.
		System.out.print("학점을 입력하세요 >> ");
		String str = sc.next();
		switch (str) {
		case "A": case "B":
			System.out.println("Excellent");
			break;
		case "C": case "D":
			System.out.println("Good");
			break;
		case "F":
			System.out.println("Bye");
		}

		// 8.
		System.out.print("커피 주문하세요. >>> ");
		String coffee = sc.next();
		int count = sc.nextInt();
		int total = 0;
		// if문 활용
		if (coffee.equals("에스프레소")) {
			total = 2000*count;
		} else if (coffee.equals("아메리카노")) {
			total = 2500*count;
		} else if (coffee.equals("카푸치노")) {
			total = 3000*count;
		} else if (coffee.equals("카페라떼")) {
			total = 3500*count;
		}
		System.out.println(total + "원 입니다.");
		// swtich문 활용
		switch (coffee) {
		case "에스프레소":
			total = 2000*count;
			break;
		case "아메리카노":
			total = 2500*count;
			break;
		case "카푸치노":
			total = 3000*count;
			break;
		case "카페라떼":
			total = 3500*count;
			break;
		}
		System.out.println(total + "원 입니다.");
	}

}
