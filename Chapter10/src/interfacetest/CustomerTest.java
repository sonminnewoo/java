package interfacetest;

public class CustomerTest {
	public static void main(String[] args) {
		Customer customer = new Customer();
		customer.sell();
		customer.buy();
		
		Buy buy = customer;
		buy.buy();
		//buy.sell();
		
		Sell sell = customer;
		sell.sell();
		//sell.buy();
		
		customer.order();
		buy.order();
		sell.order();
	}
}










