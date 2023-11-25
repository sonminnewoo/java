package morningcofee2;

public class BeanCoffee {
	
	public String name;
	public int money;
	
	public BeanCoffee(String str) {
		this.name = "콩다방" + str ;
	}
	
	public void takeCoffee(int price) {
		if(price == 4000) {
			System.out.println("콩다방에서 아메리카노를 구입했습니다.");
		}
		else if (price == 4800) {
			System.out.println("콩다방에서 라떼를 구입했습니다.");
		}
		
		money+=price;
	}

}
