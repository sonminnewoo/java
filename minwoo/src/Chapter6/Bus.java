package Chapter6;

public class Bus {
	int busNumber;
	static int passengerCount;
	int money;
	
	public Bus(int busNumber) {
		this.busNumber = busNumber;
	}
	
	public void take(int money) {
		this.money += money;
		passengerCount++;
	}
	
	public void showInfo() {
		System.out.println("버스 번호는"+busNumber+"이고 누적승객수"+passengerCount+"누적 수익"+money+"입니다");
	}
}
