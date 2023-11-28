package Chapter6;

public class Subway {
	int line;
	static int passengerCounter;
	int money;
	
	public Subway(int line) {
		this.line = line;
	}
	
	public void take(int money) {
		this.money += money;
		passengerCounter++;
	}
	
	public void showInfo() {
		System.out.println("지하철 번호는"+line+"이고 누적승객수"+passengerCounter+"누적 수익"+money+"입니다");
	}

}
