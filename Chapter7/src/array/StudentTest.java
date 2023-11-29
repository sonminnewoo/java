package array;
class Student2{
	int studentID;
	String studentName;
	public Student2(int studentID, String studentName) {
		this.studentID = studentID;
		this.studentName = studentName;
	}
	public void showInfo() {
		System.out.println(studentID+","+studentName);
	}
}
public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Student클래스를 만들고 멤버 변수로 studentID, studentName을 선언합니다.
		// studentArr 배열에 1001,tomas 1002,James 1003,Edward를 
		// 저장하고 출력하는 프로그램을 만들어 보세요.
		// ---출력결과---
		// 1001,tomas
		// 1002,James
		// 1003,Edward
		Student2[] students = new Student2[3];
		students[0] = new Student2(1001, "Tomas");
		students[1] = new Student2(1002, "James");
		students[2] = new Student2(1003, "Edward");
		for(int i=0; i<students.length; i++) {
			students[i].showInfo();
		}
		
	}

}









