package practice;

public class CardTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0; i<100; i++) {
			Card card = new Card();
			card.showInfo();
		}
		CardCompany cardCompany = CardCompany.getInstance();
		for(int i=100; i<200; i++) {
			Card card = cardCompany.createCard();
			card.showInfo();
		}
		
	}

}






