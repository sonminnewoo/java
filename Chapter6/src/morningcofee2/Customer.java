package morningcofee2;

public class Customer {
	public String name;
	public int money;
	
	public Customer(String name,int money) {
		this.name = name;
		this.money = money;
	}
	public void takeStar(String cafe,int price) {
		cafe.takeCoffee(price);
		money -= price;
	}
	public void takeBean(String cafe,int price) {
		cafe.takeCoffee(price);
		money -= price;
	}
	public void showInfo() {
		System.out.println(name+"님의 남은 돈은"+money+"입니다");
	}
}
