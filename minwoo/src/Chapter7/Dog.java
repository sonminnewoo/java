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

	public String getDogName() {
		return dogName;
	}

	public void setDogName(String dogName) {
		this.dogName = dogName;
	}

	public int getDogAge() {
		return dogAge;
	}

	public void setDogAge(int dogAge) {
		this.dogAge = dogAge;
	}
	
	
//	메서드는 리턴으로 

}
