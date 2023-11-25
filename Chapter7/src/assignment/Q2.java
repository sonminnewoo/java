package assignment;

import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 369 게임
		// 1~99 까지 숫자 생성
		for(int i = 0 ; i<100; i++) {
			
			boolean a = setFlag(i/10); // 십의 자리수 구하기 
			boolean b = setFlag(i%10);
			if(a && b) {
				System.out.println("짝짝");
			} else if (a||b) {
				System.out.println("짝");
			} else {
				System.out.println(i);
			}
		}
		System.out.println("값을 입력 해주세요");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		for(int i=1; i<=num; i++) {
			i /= 10;
		}
	}
			
			// 10 자리 숫자 구하기
//			int a = i/10;  
			// 1자리 숫자 구하기 
//			int b = 1%10; 
			
			
//		
//			if(a==3 || a==6 || a==9) {
//				System.out.print("짝");
//			}
//			
			
			
//			if(b==3 || b==6 || b==9) {
//				System.out.print("짝");
//			} else {
//				System.out.println(i);
//			}
//		}

	
			public static boolean setFlag(int num) {
			boolean flag = false;
			if(num == 3 || num == 6 || num ==9) {
				flag = true;
			}
			return flag;
	}
}

