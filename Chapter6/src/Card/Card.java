package Card;

public class Card {
	public static int customerNum = 10000 ;
	public int cardNum;
	
	public Card() {
		customerNum++;
		cardNum = cardNum;
	}
	
	public Card(int companySerialNum) {
		cardNum = companySerialNum;
	}
	
	public void cardInfo() {
		System.out.println("당신의 카드 번호 "+cardNum);
	}
}
