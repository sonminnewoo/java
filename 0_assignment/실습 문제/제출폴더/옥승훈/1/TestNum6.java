package test;

import java.util.Scanner;

public class TestNum6 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		// 돈의 액수를 입력받아 오만원권, 만원권, 천원권, 500원짜리 동전, 10원짜리 동전, 1원짜리 동전 각 몇 개로 변환되는지 출력하라. 힌트 참조
		
		System.out.println("돈의 액수를 입력하세요.>>");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		if(a/50000!=0)
		{
			System.out.println("오만원" + a/50000 + "개");
			int b = a%50000;
			System.out.println("만원" + b/10000+ "개");
			int c = b%10000;
			System.out.println("천원" + c/1000 + "개");
			int d = c%1000;
			System.out.println("500원" + d/500 +"개");
			int e = d%500;
			System.out.println("100원" + e/100 + "개");
			int f = e%100;
			System.out.println("10원" + f/10 + "개");
			int g = f%10;
			System.out.println("1원" + g +"개");
		}

	}

}
