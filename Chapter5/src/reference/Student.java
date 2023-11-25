package reference;

class Subject{
	int subjectNum;
	String subjectTitle;
	String teacherName;
	int score;
}

public class Student {
	int studentID;
	String studentName;
	Subject korea;
	Subject math;
	Subject en;
	Subject java;
	
	public Student(int studentID, String studentName) {
		this.studentID = studentID;
		this.studentName = studentName;
		korea = new Subject();
		math = new Subject();
		en = new Subject();
		java = new Subject();
	}
	
	public static void main(String [] args) {
		Student kim = new Student(1001, "이순신");
		kim.korea.subjectTitle = "국어";
		kim.math.score = 100;
		System.out.println(kim.korea.subjectTitle);
	}
	
}














