package arraylist;

public class Dog {
	private String name;
	private String type;
	
	
	public Dog(String name, String type) {
		this.name = name;
//		생성자
		this.type = type;
//		생성자
	}
	
	public String showInfo() {
//		퍼블릭 자료형 쇼인포 
		return name + ", " + type;
	}
}
