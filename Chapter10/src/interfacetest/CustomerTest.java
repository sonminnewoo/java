package interfacetest;

public class CustomerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// customer 에 Customer 인터페이스 추가
		Customer customer = new Customer();
		// 인터페이스 두개 
		customer.sell();
		customer.buy();
		
		Buy buy = customer;
		// 묵시적 형변환 
		buy.buy();
//		buy.sell();
//		customer 는 두개의 인터페이스를 가지고 있기 때문에 
//		Sell,Buy 두개 모든 가지고 있는 인터페이스를 선언할수 있다. 
		
		Sell sell = customer;
		sell.sell();
//		sell.buy();
	}
	
	Customer.order();
	Buy.order();
	sell.order();

}
