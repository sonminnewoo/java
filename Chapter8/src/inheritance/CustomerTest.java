package inheritance;

public class CustomerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Customer lee = new Customer(100,"이순신");
		lee.customerID = 10001;
		lee.customerName = "이순신";
		System.out.println(lee.showCustomerInfo());
		System.out.println("상품의 가격은 "+lee.calcPrice(10000)+"원 입니다.");
		lee.calcPrice(10000);
		System.out.println(lee.showCustomerInfo());
		
		
		VIPCustomer kim = new VIPCustomer(100,"이순신");
		kim.customerID = 10002;
		kim.customerName = "김유신";
		System.out.println(kim.showCustomerInfo());
		System.out.println("상품의 가격은 "+kim.calcPrice(10000)+"원 입니다.");
		kim.calcPrice(10000);
		System.out.println(kim.showCustomerInfo());
		
		
		VVIPCustomer woo = new VVIPCustomer();
//		VVIP 고객 woo 생성
		woo.customerID = 10003;
//		고객번호생성
		woo.customerName = "손민우";
		System.out.println(woo.showCustomerInfo());
//		고객정보 출력하는 showInfo 내용 출력
		System.out.println("상품가격은"+woo.calcPrice(10000));
		woo.calcPrice(10000);
		System.out.println(woo.showCustomerInfo());
		
//		오버로드 에대한 설명 'VIPCustomer' 에서 오버로드 설명 이어서 ★
//		System.out.println 자체를 컨트롤 스페이스 바 하면 여러가지 자료형이
//		나열되는데 이 이유가 바로 오버로드 를 이용해서 사용하게 된다 
//		하지만 이기능이 없다면 println 의 이름이 조금씩 바뀌어서 정으 해야하기 
//		때문에 사용자가 힘들어 지기도 한다 
		
//		오버라이드는 여러곳에서 사용할수 있게 하고 , 상위 클래스에서 사용될 경우
//		상위에서 사용한 방식과 다르게 사용된다면 오류를 표시하는 기능의 차이가 있다.
		
	}
	
}
