package arraylist;

import java.util.ArrayList;

public class Student {
	
//	학생아이디,학생이름 , 학생리스트(ArrayList<제너릭>) 으로 리스트 를 만들어 준다
//	다른곳에서 Student 라는 생성자를 불러와 (변수 선언할때 자료형) 과 이름 을 정하고 = 해서
//	new 생성자이름(매개변수) 를 적고 ; 헤주면 생성자 의 형식으로 새로운 자료를 만들수있다
//	그리고 그 생성된 객체 에 (객체이름).
//	학생 을 생성 , 학생의 점수 입력 하는곳을 만듬 , 학생의 showInfo 를 만듬 
//	방법은 아래 기재한대로 작성 하면된다 
//	메인에서 new 스튜던트 로 스튜던트를 지정하고 이름을 지정해서 새로 생성해준다 
//	메인에서 새로 생성된 학생의 정보를 addSubject 를 이용해서 값을 입력해 준다 
	
	// 예제 시나리오
	// 1001학번 Lee와 1002학번 kim , 두학생이 잇습니다 . Lee 학생은 2과목을 수강합니다 .
	// 국어 점수가 100점, 수학 점수가 50점 입니다. kim 학생은 3과목을 수강합니다. 국어점수가 70점
	// 수학점수가 85점 , 영어점수가 100점 입니다. Student클래스 와 Subject(과목, 스튜던트클래스 안에) 클래스를 생성한후 두 학생의
	// 과목 성적과 총점을 가각 출력해봅시다 . 
	
	int studentID;
	String studentName;
//	멤버변수 생성
	ArrayList<Subject> subjectList;
//	ArrayList<StudentL> studentList;
//	서브젝트 라는 어레이리스트<제네릭>를 만들어 준다
	
	public Student(int studentID, String studentName) {
		this.studentID = studentID;
		this.studentName = studentName;
		subjectList = new ArrayList<Subject>();
	}
//	생성자를 만들어 준다 (계속 스튜던트라는걸 생성해주기 위한것 같음
	
	public void addSubject(String name, int score) {
//		만들어준 서브젝트 어레이리스트 에 새로운 값을 넣는다 
		
//		계속해서 사용해야 한다면 아래 방식으로 
//		subjectList.add(new Subject(name,score));
//		Subject subject = new Subject();
//		subject.name = name;
//		subject.score = score;
//		
//		간단하게 선언 하기 위해서는 아래 방식으로 
		subjectList.add(new Subject(name,score));
	}
	
	
	public void showInfo() {
		int total = 0;
//		서브 젝트 하나의 변수 를 불러오기 위한 향상된 포문
		for(Subject subject : subjectList) {
//			서브젝트에 있느 스코어를 토탈에 저장해주는것
			
			total += subject.score;
			System.out.println("학샐"+studentName+"의 "+subject.name+"과목 성적은"
					+subject.score+"입니다");
		}
		System.out.println("학생"+studentName+"의 총점은"+total+"입니다");
	}
}
