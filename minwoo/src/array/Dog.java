package array;

public class Dog {
	private String name;
	private int type;
	
	
	public Dog(String name, int type) {
		this.name = name;
//		생성자
		this.type = type;
//		생성자
	}
	
	public String showInfo() {
//		퍼블릭 자료형 쇼인포 
		System.out.println(name+type);
		return name + ", " + type;
	}
}
