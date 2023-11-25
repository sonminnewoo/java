package minwooChapter5_Student;

import java.util.Scanner;

public class Student {
	
//	Student 클래스의 멤버변수
	
	int studentId;
	String studentName;
	int grade;
	String address;
	
	
//	메서드 : String 자료형으로 값을 반환 한다
//	
	public String getStudentName() {
		return studentName;
	}
//
//	public void setStudentName(String studentName) {
//		this.studentName = studentName;
//	}

//	클래스 내부에 사용하는 main
//	해당 클래스가 프로그램을 실행하는 클래스 이다 
//	클래스는 외부에서 테스트용 클래스를 만들어서 사용하는것 
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 20;
		
	
		Student son = new Student();
		Student son2 = new Student();
		son.studentName = "손민우";
		son2.studentName = "손정의";

		System.out.println(son.studentName);
		System.out.println(son.getStudentName());
		System.out.println(son2.getStudentName());

		Scanner sc = new Scanner(System.in); // 글을 읽기 위해 시스템 자원을 가져옴 
		
		
	
		
		System.out.print("숫자를 입력하세요");
		int i = sc.nextInt();
		System.out.print("숫자를 입력하세요");
		int i2 = sc.nextInt();
		System.out.print("숫자를 입력하세요");
		int i3 = sc.nextInt();
		System.out.println("당신이 입력한 숫자는 "+i+i2+i3);
		
		int sum = add(i,i2,i3,num1);
		System.out.println(i+"+"+i2+"="+sum);
	
		
		System.out.println("글자도 입력하세요");
		String s = sc.next();
		System.out.println("당신이 입력한 글자는"+s);
		
		sc.close(); // 입력받는 시스템 자원을 반환 

	}
	
//	함수는 프로그램 밖에서 구현
	
	public static int add(int i,int i2,int i3,int num1) {
		int result = i + i2 + i3 + num1;
		return result;	
	}
}
