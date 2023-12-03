//package practice;
//
//public class Dog {
//	private String name;
//	private String type;
//	public Dog(String name, String type) {
//		this.name = name;
//		this.type = type;
//	}
//	public String showDogInfo() {
//		return name + "," + type;
//	}
//}
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

