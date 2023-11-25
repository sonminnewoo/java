package assignment;

import java.util.Scanner;

public class one {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("환전할 금액을 입력하세요");
		Scanner sc = new Scanner (System.in);
		int i = sc.nextInt();
		int [] j = new int[11];
		j[10] = i ;
		
		while(0 < j[10] ){
			if(50000 < j[10]) {
				j[0] = j[10]/50000;
				j[10] = j[10]%50000;
			} else if(10000 < j[10]) {
				j[1] = j[10]/10000;
				j[10] = j[10]%10000;
			}
			else if(5000 < j[10]) {
				j[2] = j[10]/5000;
				j[10] = j[10]%5000;
			}
			else if(1000 < j[10]) {
				j[3] = j[10]/1000;
				j[10] = j[10]%1000;
			}
			else if(500 < j[10]) {
				j[4] = j[10]/500;
				j[10] = j[10]%500;
			}
			else if(100 < j[10]) {
				j[5] = j[10]/100;
				j[10] = j[10]%100;
			}
			else if(500 < j[10]) {
				j[6] = j[10]/50;
				j[10] = j[10]%50;
			}
			else if(100 < j[10]) {
				j[7] = j[10]/10;
				j[10] = j[10]%10;
			}
			else if(50 < j[10]) {
				j[8] = j[10]/5;
				j[10] = j[10]%5;
			}
			else if(1 < j[10]) {
				j[9] = j[10]/1;
				j[10] = j[10]%1;
			}
			
			} 
		
		System.out.println("50000원 권은"+j[0]+"매 입니다");
		System.out.println("10000원 권은"+j[1]+"매 입니다");
		System.out.println("5000원 권은"+j[2]+"매 입니다");
		System.out.println("1000원 권은"+j[3]+"매 입니다");
		System.out.println("500원 권은"+j[4]+"매 입니다");
		System.out.println("100원 권은"+j[5]+"매 입니다");
		System.out.println("50원 권은"+j[6]+"매 입니다");
		System.out.println("10원 권은"+j[7]+"매 입니다");
		System.out.println("5원 권은"+j[8]+"매 입니다");
		System.out.println("1원 권은"+j[9]+"매 입니다");
		
			
	
	}
}



