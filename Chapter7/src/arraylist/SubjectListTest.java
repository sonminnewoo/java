package arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class SubjectListTest {

	public static void main(String[] args) {
		
//		ArrayList<Student> studentList;
		
		// TODO Auto-generated method stub
		// 예제 시나리오
		// 1001학번 Lee와 1002학번 kim , 두학생이 잇습니다 . Lee 학생은 2과목을 수강합니다 .
		// 국어 점수가 100점, 수학 점수가 50점 입니다. kim 학생은 3과목을 수강합니다. 국어점수가 70점
		// 수학점수가 85점 , 영어점수가 100점 입니다. Student클래스 와 Subject(과목, 스튜던트클래스 안에) 클래스를 생성한후 두 학생의
		// 과목 성적과 총점을 가각 출력해봅시다 . 

		//		시나리오 대로 작성
//		메인에서 만든 생성자들 불러옴 

//		기능 추가하기 
//		과목 수 입력하여 설정하기 
//		저장한 학생으로 검색해서 showInfo 실행하기 
//		학생을 검색 하게끔 하려면 ArrayList 이용해서 작성 해야한다 
		


		ArrayList<Student> studentList = new ArrayList<Student>();
		
		Student lee = new Student(1001,"lee");
		lee.addSubject("국어", 100);
		lee.addSubject("수학", 50);
		lee.showInfo();
		studentList.add(lee);
		Student kim = new Student(1002,"kim");
		kim.addSubject("국어", 85);
		kim.addSubject("수학", 85);
		kim.addSubject("영어", 85);
		studentList.add(kim);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("학번과 이름을 작성해주세요.");
		Student student = new Student(sc.nextInt(), sc.next());
		System.out.println("과목수를 작성하세요");
		
		int i = sc.nextInt();
		for (int j =0; j<i ; j++){
			System.out.println("과목이름과 점수를 입력해주세요.");
			student.addSubject(sc.next(), sc.nextInt());
		}

	
		studentList.add(lee);
		studentList.add(kim);
		studentList.add(student);
		System.out.println("검색할 학생을 입력해주세요 ");
		String name = sc.next();
		for (Student s : studentList) {
			if(s.studentName.equals(name)) {
//				글자를 비교하는 이큐얼스 로 검색해준다 
				s.showInfo();
				break;
			}
		}
		student.showInfo();	
	}
}
