package minwooChapter5_Student;

class Subject {
	String sName;
	int sScore;
	
	public void showInfo() {
		System.out.println(sName);
		System.out.println(sScore);
	}
}

public class PersonTest {
	String name;
	int age;
	Subject math;
	Subject English;
	int total;
	
	public PersonTest(String pname , int page) {
		this.name = pname;
		this.age = page;
		math = new Subject();
		English = new Subject();
	}
	

	
	public static void main(String[] args) {
		PersonTest son = new PersonTest("손민우", 30);
		son.math.sName = "수학";
		son.math.sScore = 80;
		son.English.sName = "영어";
		son.English.sScore = 90;
		System.out.println(son.name + son.age);
		son.math.showInfo();
		son.English.showInfo();
		
	}
}
