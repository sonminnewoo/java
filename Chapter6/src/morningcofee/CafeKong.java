package morningcofee;

public class CafeKong {
	
	public int cafeName;
	public int oder;
	public int money;
	
	public CafeKong(int cafeName) {
		this.cafeName = cafeName;
	}
	
	public void take(int money) {
		this.money += money;
		oder++;
	}
	
	public void showInfo() {
		System.out.println("주문하신 메뉴는 " +cafeName+"가격은"+money+"입니다");
	}
}