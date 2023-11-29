package arraylist;

import java.util.ArrayList;

public class Student {
	// 예제 시나리오
	// 1001학번 Lee와 1002학번 kim, 두학생이 있습니다. Lee학생은 2과목을 수강합니다.
	// 국어 점수가 100점, 수학 점수가 50점 입니다. kim학생은 3과목을 수강합니다. 국어점수가 70점
	// 수학점수가 85점, 영어점수가 100점 입니다. Student클래스와 Subject클래스를 생성한 후 두학생의
	// 과목 성적과 총점을 각각 출력해봅시다.
	int studentID;
	String studentName;
	ArrayList<Subject> subjectList;
	
	public Student(int studentID, String studentName) {
		this.studentID = studentID;
		this.studentName = studentName;
		subjectList = new ArrayList<Subject>();
	}
	
	public void addSubject(String name, int score) {
//		Subject subject = new Subject();
//		subject.name = name;
//		subject.score = score;
//		subjectList.add(subject);
		subjectList.add(new Subject(name,score));
	}
	public void showInfo() {
		int total = 0;
		for(Subject subject : subjectList) {
			total += subject.score;
			System.out.println("학생" + studentName+"의 "+subject.name+"과목 성적은 "
						+ subject.score + "점 입니다.");
		}
		System.out.println("학생 " + studentName+"의 총점은 "+total+"점 입니다.");
	}
}













