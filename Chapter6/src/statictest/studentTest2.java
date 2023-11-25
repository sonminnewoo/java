package statictest;

public class studentTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student lee = new Student();
		System.out.println(lee.studentID);
		
		Student kim = new Student();
		System.out.println(kim.studentID);
		
		for(int i=0; i<100; i++) {
			Student ahn = new Student();
			System.out.println(ahn.studentID);
		}
	}

}








