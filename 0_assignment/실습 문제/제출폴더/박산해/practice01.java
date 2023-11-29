package practice;

public class practice01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Q1
		 /*     Scanner sc = new Scanner(System. in);
				System.out.print("두 정수를 입력해주세요>>");
				int i = sc.nextInt();
				int j = sc.nextInt();
				System.out.println(i+"+"+j+"="+(i+j)+"입니다."); */
			
			
			//Q2
		/*	  Scanner sc = new Scanner(System. in);
		    	System.out.print("건물의 층 수를 입력하세요>>");
				int floor = sc.nextInt();
				int high = 5;
				System.out.println(floor+"층 까지의 높이는 "+(floor*high)+"m 입니다."); */
				
			
			//Q3
		/*	Scanner sc = new Scanner(System. in);
			System.out.print("x의 값을 입력하세요>>");
			int x = sc.nextInt();
			int y = (x*x)-(3*x)+7;
			System.out.println("x="+x+" y"+y+" 입니다."); */
			
			
			//Q5
		/*	Scanner sc = new Scanner(System. in);
			System.out.print("논리 연산을 입력하세요>> ");
			boolean a = sc.nextBoolean();
			String op = sc.next();
			boolean b = sc.nextBoolean();
			
			switch(op) {
			case "AND" : System.out.println(a && b);
			break;
			case "OR" : System.out.println(a || b);
			break;
			} */
			
			
			//Q6
		/*	Scanner sc = new Scanner(System.in);
			System.out.print("돈의 액수를 입력하세요 >>> ");
			int n = sc.nextInt();
			
			int a = n / 50000;
			int a5 = n % 50000;
			int b = a5 / 10000;
			int b1 = a5 % 10000;
			int c = b1 / 1000;
			int c10 = b1 % 1000;
			int d = c10 / 500;
			int d500 = c10 % 500;
			int e = d500 / 100;
			int e100 = d500 % 100;
			int f = e100 / 10;
			int f10 = e100 % 10;
			int g = f10 / 1;
			System.out.println("오만원 " + a + "개, 만원 " + b + "개, 천원 " + c + "개, 오백원 " + d + "개, 백원 "
					+ e + "개, 십원 " + f + "개, 일원 " + g + "개");  */
			
			
			//Q7
		/*	Scanner sc = new Scanner(System.in);
			System.out.print("학점을 입력하세요 >>> ");
			String grade = sc.next();
			switch (grade) {
			case "A": case "B":
				System.out.println("Excellent");
				break;
			case "C": case "D":
				System.out.println("Good");
				break;
			case "F":
				System.out.println("Bye");
			} */
			
			
			//Q8
		/*	Scanner sc = new Scanner(System.in);
			System.out.print("커피 주문하세요>> ");
			String coffee = sc.next();
			int cup = sc.nextInt();
			// <if문>
				if (coffee.equals("에스프레소")) {
				System.out.println(2000 * cup + "원입니다.");
			} else if (coffee.equals("아메리카노")) {
				System.out.println(2500 * cup + "원입니다.");
			} else if (coffee.equals("카푸치노")) {
				System.out.println(3000 * cup + "원입니다.");
			} else if (coffee.equals("카페라떼")) {
				System.out.println(3500 * cup + "원입니다.");
			} else {
				System.out.println("다시 입력해주세요.");
			}  
			// <swtich문>
			switch (coffee) {
			case "에스프레소":
				System.out.println(2000 * cup + "원입니다.");
				break;
			case "아메리카노":
				System.out.println(2500 * cup + "원입니다.");
				break;
			case "카푸치노":
				System.out.println(3000 * cup + "원입니다.");
				break;
			case "카페라떼":
				System.out.println(3500 * cup+ "원입니다.");
				break;
			}  */
		
		}
	}