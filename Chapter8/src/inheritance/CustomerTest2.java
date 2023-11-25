package inheritance;

public class CustomerTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Customer lee = new Customer(100,"이순신");
		System.out.println("상품의 가격은 "+lee.calcPrice(10000)+"원 입니다.");
		
//		
//		VIPCustomer kim = new VIPCustomer(101,"김유신");
//		System.out.println("상품의 가격은 "+kim.calcPrice(10000)+"원 입니다.");
//	
//		
//		VVIPCustomer woo = new VVIPCustomer();
//		System.out.println("상품가격은"+woo.calcPrice(10000));
//		
//		묵시적 클래스 형 변환 부모 이름 = new vipcustomer
		Customer ahn = new VIPCustomer(10003, "Ahn");
		// agentID 는 부모 클래스인 Customer에는 존재하지 않기 떄문에 에러 발생
		// Customer 에는 agentID 가 없다
		
//		System.out.println(ahn.agentID);  이거는 자식에서 정의한 변수 이기때문에
//		사용하면 오류가 발생한다 
		
//		변수 선언만 한상태이다
		// 이것도 동일하게 사용할수 없다 
//		System.out.println(ahn.getAgentID());
//		이렇게 사용하는 이유는 재정의 된 메서드는 메모리 주소를 가지고 변형할수 있고
//		그냥 자식 인경우에는 메모리가 있더라도 그것을 사용할수 없기때문
		
		//하우 클래스는 상위 클래스로 형변환 했을 경우 하위클래스에만 존재하는 멤버변수난 메서드는 사용할수없음 
//		상위 클래스 Customer 에 존재하는 멤버 변수, 메서드는 사용 가능
		System.out.println(ahn.customerID);
		System.out.println(ahn.customerGrade);
		System.out.println(ahn.getCustomerName());
//		이것을 재정의 된 메서드(오버라이드)된 메서드는 하위 클래스의 메서드가 실행됩니다.
		System.out.println("상품의 가격은 "+ahn.calcPrice(10000)+"원 입니다.");
	}
	
}
