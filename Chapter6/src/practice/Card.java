package practice;

public class Card {
	public static int serialNum = 100000;
	public int cardNum;
	public Card() {
		serialNum++;
		cardNum = serialNum;
	}
	public Card(int companySerialNum) {
		cardNum = companySerialNum;
	}
	public void showInfo() {
		System.out.println(cardNum);
	}
	
}
