package cooperation;

public class Subway {
	public int lineNumber;
	public int passengerCount;
	public int money;
	
	public Subway(int lineNumber) {
		this.lineNumber = lineNumber;
	}
	
	public void take(int money) {
		this.money += money;
		passengerCount++;
	}
	
	public void showInfo() {
		System.out.println("지하철 " +lineNumber+"호선의 승객은 "
				+passengerCount+"명이고, 수입은 "+money+"입니다.");
	}
}










