package practice5;

public class Student {
	
//	멤버변수
	int sno;
	String name;
	String dept;
	int[] scores = new int[3];
	double avg;
	int rank;

//	생성자

	public Student(int sno, String name, String dept, int score1, int score2, int score3) {
//		받아 올때 요소 부분 개수 , 변수 데이터 형식 맞게 해줘야함
		this.sno = sno;
		this.name = name;
		this.dept = dept;
		scores[0] = score1;
		scores[1] = score2;
		scores[2] = score3;
		setAvg();
	}

//	메서드 

	public int totalscore() {
		int total = 0;
		for (int score : scores) {
			total += score;
		}
		return total;
	}
//	메서드

	public void setAvg() {
		int total = totalscore();
		avg = total / scores.length;
//		위 내용을 
//		avg = totalscore() / scores.length; 로 할수 있다 .
	}

	public void setLank(Student[] students) {
		int rank = 1;
		int total = totalscore();
		for (int i = 0; i < students.length; i++) {
			if (total < students[i].totalscore()) {
				rank++;
			}
		}
		this.rank = rank;
	}

// main 메서드
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student[] students = new Student[3];
		students[0] = new Student(1, "홍길동", "영문", 80, 70, 80);
		students[1] = new Student(2, "박경미", "컴공", 70, 80, 75);
		students[2] = new Student(3, "하성호", "전컴", 80, 85, 90);
		System.out.println("학번 이름 학과 성적1 성적2 성적3 총점 평균 석차");
		for (Student student : students) {
			System.out.println (student.sno+" "+student.name+" "+student.dept+" "+student.scores[0]
					+" "+student.scores[1]+" "+student.scores[2]+" "+student.avg+" "+student.rank);
		}
//		출력할때 효소간 + 해서 연결한다

	}

}
