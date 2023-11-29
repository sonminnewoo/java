package test;

import java.util.Scanner;

public class TestNum5 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		// And 와 Or의 논리연산을 입력받아 결과를 출력하는 프로그램을 작성하라
		System.out.println("논리 연산을 입력해주세요.>>");
		Scanner sc = new Scanner(System.in);
		boolean a = sc.nextBoolean();
		String op = sc.next();
		boolean b = sc.nextBoolean();
		
		
		String str = "";
		
		switch(op)
		{
			case "AND" : str = "false";
			break;

			case "OR" : str = "true";
			break;
		}
		System.out.println("결과는 " + str + "입니다.");
		
	}

}
