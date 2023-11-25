package assignment;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//배열로 한방에 금액 입력 
		int [] arr = {50000, 10000, 5000, 1000, 500, 100, 10,5,1};
		// 금액 입력 받기
		Scanner sc = new Scanner(System.in);
		System.out.println("금액을 입력해주세요 ");
		
		int money = sc.nextInt();
		//배열을 랭스 , 리스트는 사이즈 
		for(int i =0 ; i<arr.length; i++ ) {
			// 배열을 이용해서 글자를 출력하면서 개산하는 구문
			System.out.print(arr[i]+"원권 "+money/arr[i]+"매, "); 
			 // 나누고 난 나머지 값 
			money %= arr[i];
		}
	}

}
