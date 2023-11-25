package access;

public class AccessModifierTest {
	
	public static void main(String[]args) {
		Student kim = new Student();
		kim.studentID = 1001;
		//kim.studentName = "-/*+!@#$!@#123456789123456789123456789123456789123456789123456789123456789";
		kim.setStudentName("김유신");
		System.out.println(kim.getStudentName());
		kim.score = 100;
		System.out.println(kim.score);
	}
}









