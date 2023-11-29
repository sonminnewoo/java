package inheritance;

public class CustomerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer lee = new Customer(10001,"이순신");
//		lee.customerID = 10001;
//		lee.customerName = "이순신";
		System.out.println(lee.showCustomerInfo());
		System.out.println("상품의 가격은 "+lee.calcPrice(10000)+"원 입니다.");
		System.out.println(lee.showCustomerInfo());
		
		VIPCustomer kim = new VIPCustomer();
		kim.customerID = 10002;
		kim.customerName = "김유신";
		System.out.println(kim.showCustomerInfo());
		System.out.println("상품의 가격은 "+kim.calcPrice(10000)+"원 입니다.");
		System.out.println(kim.showCustomerInfo());
		
	}

}






