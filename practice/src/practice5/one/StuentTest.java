package practice5.one;

import java.util.ArrayList;
import java.util.Scanner;

import array.Book;

public class StuentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int seo ;
		String name ;
		String dept ;
		double avg ;
		int rank ;
		int[] score = new int[3];
		
		String [] list = {"학번","이름","학과","성적1","성적2","성적3","총점","평균","석차"};
		ArrayList<Student> studentList = new ArrayList<Student>();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("학번, 이름 , 학과 , 성적 1,2,3 을 입력하면 총점과 평균을 표시 하겠습니다.");
		Student studentList = new Student(sc.nextInt() , sc.next());
		
	}

}
