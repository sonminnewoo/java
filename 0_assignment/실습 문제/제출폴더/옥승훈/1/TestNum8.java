package test;


import java.util.Scanner;

public class TestNum8 
{

	public static void main(String[] args) 
	{
		System.out.print("커피 주문하세요.>>");
		Scanner sc = new Scanner(System.in);
		String coffee = sc.next();
		int num = sc.nextInt();
		System.out.println(coffee +" " + num);
		
		int cost = 0;
		switch(coffee)
		{
		 case "에스프레소":
			 cost = 2000;
			 break;
		 case "아메리카노":
			 cost = 2500;
			 break;
		 case "카푸치노":
			 cost = 3000;
			 break;
		 case "카페라떼":
			 cost = 3500;
			 break;
		}
		System.out.println(num * cost + "원입니다.");
	}

}
