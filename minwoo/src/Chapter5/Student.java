package Chapter5;

import java.util.Scanner;

public class Student {
	
//	Student 클래스의 멤버변수
//	클래스 생성자를 이용해서 인스턴스를 생성하게 ㅗ디면
//	아래의 멤버변수가 생성되는 데 이들은 저장공간이 있어야하고 이때
//	사용하는 메모리가 힙 메모리 이다 .
//	인스턴스를 저장하는 메모리를 스택메모리 에 저장된 son,son2 변수가 자신의 멤버변수의 
//	힙 메모리 라는 곳을 가리킨다 
//	일반적으로 프로그램에서는 스택,힙,데이터 세영ㅇ역을 사용한다 . 
//	객체가 생성될때 사용하는 공간이 힙이다.
	 
	
	int studentId;
	String studentName;
	int grade;
	String address;
	
	
//	메서드 : String 자료형으로 값을 반환 한다

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
		
	
//		Student 클래스를 들고와 son 이라는 인스턴스를 만든다
//		son,son2 라는 서로 다른 두개 인스턴스가 생성된다 
//		참조 변수 사용하기 로 (.)도트 연산자를 사용한다 . 
		Student son = new Student();
		Student son2 = new Student();
//		도트 연산자를 이용해 son,son2 인스턴스에 . 를 추가 멤버변수로
//		각 인스턴스의 name 멤버변수를 정의 
		son.studentName = "손민우";
		son2.studentName = "손정의";

//		출력문에서 son,son2 에 . 를 추가해서 name 을 출력 
		
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
