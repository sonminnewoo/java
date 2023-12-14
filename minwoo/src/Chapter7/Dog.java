package Chapter7;

public class Dog {
	String dogName;
	int dogAge;
	
	public Dog(String dogName,int dogAge) {
		this.dogName = dogName;
		this.dogAge = dogAge;
	}
	
	public String showInfo() {
		return dogName+dogAge;
	}
	
//	메서드는 리턴으로 

}
