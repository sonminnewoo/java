package array;

class Student33 {
	private int studentID;
	private String studentName;

	public Student33() {
		studentID = 0;
		studentName = "";
	}

	public Student33(int studentID, String studentName) {
		this.studentID = studentID;
		this.studentName = studentName;
	}

	public void showInfo() {
		System.out.println(studentID + "," + studentName);
	}

	public int getStudentID() {
		return studentID;
	}

	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

}
public class min_StudentTest {

	public static void main(String[] args) {
		
	
		// TODO Auto-generated method stub

		
		Student33[] students331 = new Student33[3] ;
		students331[0] = new Student33(1001, "tomas");
		students331[1] = new Student33(1001, "tomas");
		students331[2] = new Student33(1001, "tomas");
		
		for(int i=0 ; i<students331.length; i++) { 
			students331[i].showInfo();
		}
	}

}
