package test;

import java.util.Scanner;

public class TestNum2 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		// 한 층의 높이가 5m일 때, 건물이 몇 층인지 입력받아 높이를 출력하라.
		System.out.println("높이를 알고싶은 층을 입력해주세요.>>");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = 5*a;
		System.out.println(a + "층은 " + b + "m입니다.");
		

	}

}
