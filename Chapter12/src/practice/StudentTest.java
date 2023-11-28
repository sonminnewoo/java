package practice;

import java.util.HashSet;

class Student{
	
	String studentID;
	String studentName;
	
	public Student(String studentID, String studentName) {
		this.studentID = studentID;
		this.studentName = studentName;
	}
	
	@Override
	public String toString() {
		return studentID + ":" + studentName;
	}
	
	@Override
	public int hashCode() {
		return studentID.hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		if(studentID.hashCode() == obj.hashCode()) {
			return true;
		}
		return false;
	}
	
}

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Student> set = new HashSet<Student>();
		set.add(new Student("100","홍길동"));
		set.add(new Student("200","강감찬"));
		set.add(new Student("300","이순신"));
		set.add(new Student("400","정약용"));
		set.add(new Student("100","송중기"));
		System.out.println(set);
	}

}





