package assignment;

import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("시작 소문자를 입력하세요");
		String str = sc.next(); 
//		스트링은 char 를 나열해서 저장한다 
		char end = str.charAt(0); 
		for(int i = end; i>='a'; i--) {
		for(char j='a'; j<=i; j++) {
			System.out.print(j);
		}
		System.out.println();
//		반복문 
		
	}

}
}
