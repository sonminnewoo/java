package test;

import java.util.Scanner;

public class TestNum7 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		System.out.println("학점을 입력하세요.>>");
		Scanner sc = new Scanner(System.in);
		String i = sc.next();
		String j="";
		
		
		switch(i)
		{
		 case "A": 
		 case "B": 
			 j = "Excellent" ;
			 break;
		 case "C":
		 case "D":
			 j = "Good";
			 break;
		 default:
			 j = "Bye";
			 break;
		}
		
		System.out.println(j);
		

	}

}
