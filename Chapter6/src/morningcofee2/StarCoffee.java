package morningcofee2;

public class StarCoffee {
	
	public String name;
	public int money;
	
	public StarCoffee(String str) {
		this.name = "별다방" + str ;
	}
	
	public void takeStar(int price) {
		if(price == 4000) {
			System.out.println("별다방에서 아메리카노를 구입했습니다.");
		}
		else if (price == 4800) {
			System.out.println("별다방에서 라떼를 구입했습니다.");
		}
			
		money+=price;
		
		public void showInfo() {
			System.out.println("금액은 이렇습니다");
		}
	}

}
