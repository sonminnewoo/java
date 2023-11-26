package minwooChapter5_Student;

public class StudentFinalTest {

	int age;
	String name;
	boolean marrid;
	int baby;
	
	public void showInfo() {
		System.out.println("이사람의 정보");
		System.out.println(age);
		System.out.println(name);
		System.out.println(marrid);
		System.out.println(baby);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StudentFinalTest son = new StudentFinalTest();
		son.age = 30;
		son.name = "손민우";
		son.marrid = false;
		son.baby = 0;
		
		son.showInfo();
	}

}
