package polymorphism;

public class CustomerTest {
	
	// 브론즈 등급과 골드 등급을 추가해 보세요.
	// 등급 = 브론즈, 할인율 = 0, 적립 포인트 = 0 
	// 등급 = 골드 , 할인율 = 5% , 적립 포인트 = 5%
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer lee = new Customer(1001,"이순신");
		Customer kim = new VIPCustomer(1002,"김유신",1102);
		Customer gold = new GoldCustomer(1003,"Gold");
		Customer bronze = new BronzeCustomer(1004,"Bronze");
		
		customerTest(lee, 10000);
		customerTest(kim, 10000);
		customerTest(gold, 10000);
		customerTest(bronze, 10000);
		
	}
	public static void customerTest(Customer customer, int price) {
		System.out.println(customer.customerName+"님이 "
						+customer.calcPrice(price)+"원을 지불하셨습니다.");
		System.out.println(customer.showCustomerInfo());
	}
}








