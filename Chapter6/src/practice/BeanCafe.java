package practice;

public class BeanCafe {
	public String name;
	public int money;
	
	public BeanCafe(String str) {
		this.name = "콩다방" + str;
	}
	
	public void takeCoffee(int price) {
		if(price == 3800) {
			System.out.println("콩다방에서 아메리카노를 구입했습니다.");
		}else if(price == 4500) {
			System.out.println("콩다방에서 라떼를 구입했습니다.");
		}
		money+=price;
	}
	
	public void showInfo() {
		System.out.println(name + "의 수입은 "+money+"입니다.");
	}
}





