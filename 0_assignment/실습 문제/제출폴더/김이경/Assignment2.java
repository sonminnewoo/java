package hello;

import java.util.Scanner;

public class Assignment2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("몇 층인지 입력하세요.>>");
		int floor = sc.nextInt();

		int m = (floor * 5);

		System.out.println(m + "m 입니다.");
		;

	}
}
