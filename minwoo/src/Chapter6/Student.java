package Chapter6;

class Texi {
	int money;
	int texiNumber;
	 static int passengerCount;
	
	public Texi(int texiNumber) {
		this.texiNumber = texiNumber;
	}
	
	public void take(int money) {
		this.money += money;
		passengerCount++;
	}
	
	public void showInfo() {
		System.out.println(money+":"+texiNumber+":"+passengerCount);
	}
}

public class Student {
	public String studentName ;
	public int grade;
	public int money;
	
	public Student(String studentName,int money ) {
		this.studentName = studentName;
		this.money = money;
	}
	
	public void taketexi(Texi texi) {
		texi.take(10000);
		this.money -=10000;
	}
	
	public void takebus(Bus bus) {
		bus.take(1000);
		this.money -= 1000;
	}
	
	public void takeSubway(Subway subway) {
		subway.take(1500);
		this.money -= 1500;
	}
	
	public void showInfo() {
		System.out.println(studentName+"님의 남은돈은"+money+"입니다");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student lee = new Student("이순신", 30000);
		Student kim = new Student("김씨", 20000);
		Student edward = new Student("edward", 20000);
		
		Texi t1 = new Texi(1);
		
		Bus bus100 = new Bus(100);
		Bus bus200 = new Bus(200);
		
		
		lee.takebus(bus100);
		lee.showInfo();
		bus100.showInfo();
		
		edward.taketexi(t1);
		edward.showInfo();
		t1.showInfo();
	}

}
