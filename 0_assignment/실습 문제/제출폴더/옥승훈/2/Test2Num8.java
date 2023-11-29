package test;

import java.util.Scanner;

public class Test2Num8 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		

		Scanner sc = new Scanner(System.in);
		int i = 0; //승리횟수
		int j = 0; //패배횟수
		int k = 0; //무승부횟수
		String me="";
		String cpu="";
		while(i<5)
		{
		System.out.println("가위(1), 바위(2), 보(3), 중에 선택해주세요.>>");
		int a = sc.nextInt();
		
		int com = (int)(Math.random() *3)+1;
		
		int b = com - a;
		
		switch(a)
		{
			case 1:
				me="가위";
				break;
			case 2:
				me="바위";
				break;
			case 3:
				me="보";
				break;
		}
		switch(com)
		{
			case 1:
				cpu="가위";
				break;
			case 2:
				cpu="바위";
				break;
			case 3:
				cpu="보";
				break;
		}
		
		if(b==2||b==(-2))
		{
			System.out.println("플레이어 " + me + " vs " + cpu + " 컴퓨터 : 승리");
			i++;
		}
		else  if(b ==1 || b ==(-2))
		{
			System.out.println("플레이어 " + me + " vs " + cpu + " 컴퓨터 : 패배");
			j++;
		}
		else if(b == 0)
		{
			System.out.println("플레이어 " + me + " vs " + cpu + " 컴퓨터 : 무승부");
			k++;
		}
		System.out.println("승리" + i +"/5 , 패배" + j +"무승부" + k);
		}
	}
}
			



