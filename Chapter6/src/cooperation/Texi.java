package cooperation;

public class Texi {
	public int texiNumber;
	public int passengerCount;
	public int money;
	
	public Texi(int texiNumber) {
		this.texiNumber = texiNumber;
	}
	
	public void take(int money) {
		this.money += money;
		passengerCount++;
	}
	
	public void showInfo() {
		System.out.println("택시 " +texiNumber+"번의 승객은 "
				+passengerCount+"명이고, 수입은 "+money+"입니다.");
	}
}









