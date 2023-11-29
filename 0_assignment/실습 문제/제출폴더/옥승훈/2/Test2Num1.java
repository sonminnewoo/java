package test;

import java.util.Scanner;

public class Test2Num1 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		// 구구단을 짝수단만 출력하도록 프로그램을 만들어보세요.
		
		for(int a =2; a<=9; a++)
		{
			if(a%2 !=0)
			{
				continue;
			}
			System.out.println(a + "단.");
			for(int b = 1; b<=9; b++)
			{
				System.out.println(a + "*" + b + "=" + a*b);
			}
		
		}
		
	}

}
