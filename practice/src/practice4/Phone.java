package practice4;

import java.util.Scanner;

public class Phone {
	
//	멤버변수 생성 (필드)
private String name; 
private String tel;

//(String name, String tel) 인수를 가진 생성자의 선언
public Phone (String name, String tel) {
	this.name=name;
	this.tel=tel;
}

public String getName() { return name; }
public String getTel() { return tel; }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("이름과 전화번호 입력 >>");
		Phone p1 = new Phone(sc.next(),sc.next());
		Phone p2 = new Phone(sc.next(),sc.next());
		
		System.out.println(p1.getName()+"의번호는"+p1.getTel());
		System.out.println(p2.getName()+"의번호는"+p2.getTel());

	}
}
