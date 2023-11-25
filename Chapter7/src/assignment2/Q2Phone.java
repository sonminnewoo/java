package assignment2;

import java.util.Scanner;

public class Q2Phone {

	private String name, tel;
	
	public Q2Phone(String name, String tel) {
	this.name = name;
	this.tel = tel;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		public String getName() { return name; }
		public String getTel() { return tel; }
		

//		2. 다음은 이름(name 필드)과 전화번호(tel 필드)를 가진 Phone 클래스이다. 이름과 전화번
//		호를 입력받아 2개의 Phone 객체를 생성하고, 출력하는 main 메소드를 작성하라.
//		[목적 – 클래스 만들기 연습] [난이도 하]
		Scanner sc = new Scanner(System.in);
		
		System.out.println("이름과 휴대전화를 입력하세요");
		Q2Phone min1 = new Q2Phone(sc.next(),sc.next());
		
		System.out.println(min1.getName(), min1.getTel());
		
	}

}
