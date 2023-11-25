package polymorphism;

public class CustomerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Customer lee = new Customer(1001,"이순신");
		Customer kim = new VIPCustomer(1002,"김유신",1102);
		Customer son = new VIPCustomer(1003,"김유신",1102);
		Customer min = new VIPCustomer(1004,"김유신",1102);
		Customer woo = new VIPCustomer(1005,"김유신",1102);
		
//		new 대문자 였고 
//		클래스 선언 
		
				customerTest(lee, 1000);
				customerTest(kim, 2000);
				customerTest(son, 3000);
				customerTest(min, 4000);
				customerTest(woo, 5000);

	}
//	밑의 메소드 하나로 여러 클래스 를 이용해서 다양한 결과 를 출력하게 한다 
	public static void customerTest(Customer customer,int price) {
		System.out.println(customer.customerName+"님이 "+
						customer.calcPrice(price)+"를 지불하셨습니다");
		System.out.println(customer.showCustomerInfo());
	}
}
