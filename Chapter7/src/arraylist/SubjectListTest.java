package arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class SubjectListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 예제 시나리오
		// 1001학번 Lee와 1002학번 kim, 두학생이 있습니다. Lee학생은 2과목을 수강합니다.
		// 국어 점수가 100점, 수학 점수가 50점 입니다. kim학생은 3과목을 수강합니다. 국어점수가 70점
		// 수학점수가 85점, 영어점수가 100점 입니다. Student클래스와 Subject클래스를 생성한 후 두학생의
		// 과목 성적과 총점을 각각 출력해봅시다.
		Student lee = new Student(1001, "Lee");
		lee.addSubject("국어", 100);
		lee.addSubject("수학", 50);
		lee.showInfo();
		
		Student kim = new Student(1002, "Kim");
		kim.addSubject("국어", 70);
		kim.addSubject("수학", 85);
		kim.addSubject("영어", 100);
		kim.showInfo();
		
		//기능 추가하기
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("학번과 이름을 작성해주세요.");
		Student student = new Student(sc.nextInt(), sc.next());
		
		//과목 수를 입력하여 설정하기 (반복문)
		System.out.println("과목수를 입력해주세요.");
		int count = sc.nextInt();
		for(int i=0; i<count; i++) {
			System.out.println("과목이름과 점수를 입력해주세요.");
			student.addSubject(sc.next(), sc.nextInt());
		}
		//이름으로 학생을 검색하여 showInfo() 실행하기 (ArrayList 사용)
		ArrayList<Student> studentList = new ArrayList<Student>();
		studentList.add(lee);
		studentList.add(kim);
		studentList.add(student);
		System.out.println("검색할 학생의 이름을 입력해주세요.");
		String name = sc.next();
		for(Student s : studentList) {
			if(s.studentName.equals(name)) {
				s.showInfo();
				break;
			}
		}
		
	}

}











