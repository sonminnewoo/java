package Card;

public class CardTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=0; i<100; i++) {
			Card card = new Card();
			card.cardInfo();
		}
		CardCompany cardCompany = CardCompany.getInstance();
		for(int i = 100 ; i <= 200; i++) {
			Card card = cardCompany.createCard();
			card.cardInfo();
		}
		
	}

}
