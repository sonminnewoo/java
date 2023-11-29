package test;

import java.util.Scanner;

public class TestNum1 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		// 두 정수를 입력받아 합을 구하여 출력하는 프로그램을 작성하라. 키보드 입력은 Scanner 클래스를 이용하라
		System.out.println("합을 구할 첫 번째 숫자를 입력하세요.>");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		System.out.println("합을 구할 두 번째 숫자를 입력하세요.>");
		Scanner sc2 = new Scanner(System.in);
		int b = sc2.nextInt();
		int c = a+b;
		System.out.println(a + "+" + b + "은 " + c);
		
		
	}

}
