package hello;

import java.util.Scanner;

public class Assignment7 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("학점을 입력하세요. >>");
		
		
		String mark = sc.next();
		String Value = "";

		switch (mark) {
		case "A": 
			Value = "Excellent";
			break;
		case "B":
			Value = "Excellent";
			break;
		case "C":
			Value = "Good";
			break;
		case "D":
			Value = "Good";
			break;
		case "F":
			Value = "Bye";
			break;
			
		}

		System.out.println("성적 등급은"+ Value + "입니다.");
		
		
		
	}
}
