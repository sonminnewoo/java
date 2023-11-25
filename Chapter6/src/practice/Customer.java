package practice;

public class Customer {
	public String name;
	public int money;
	
	public Customer(String name, int money) {
		this.name = name;
		this.money = money;
	}
	
	public void takeStarCafe(StarCafe cafe, int price) {
		cafe.takeCoffee(price);
		money -= price;
	}
	
	public void takeBeanCafe(BeanCafe cafe, int price) {
		cafe.takeCoffee(price);
		money -= price;
	}
	
	public void showInfo() {
		System.out.println(name+"님의 남은 돈은 "+money+" 입니다.");
	}
}











