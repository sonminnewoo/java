package test;

import java.util.Scanner;

public class TestNum3 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		// x 값을 받아 y = x^2-3x+7 식을 계산하여 y 값을 출력하는 프로그램을 작성하라
		System.out.println("x 값을 입력해주세요.");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		
		int y = x*x - 3*x + 7;
		
		System.out.println("x = " + x + ",y = " + y);
		
		
	}

}
