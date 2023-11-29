package inheritance;

public class CustomerTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer lee = new Customer(10001,"이순신");
		System.out.println("상품의 가격은 "+lee.calcPrice(10000)+"원 입니다.");
		VIPCustomer kim = new VIPCustomer(10002,"김유신");
		System.out.println("상품의 가격은 "+kim.calcPrice(10000)+"원 입니다.");
		//묵시적 클래스 형 변환
		Customer ahn = new VIPCustomer(10003, "Ahn");
		//agentID는 부모클래스인 Customer에는 존재하지 않기 때문에 에러 발생
		//하위 클래스를 상위클래로 형변환 했을 경우 하위클래스에만 존재하는 멤버변수나 메서드는 사용할 수 없음 
		//System.out.println(ahn.agentID);
		//System.out.println(ahn.getAgentID());
		//상위 클래스 Customer에 존재하는 멤버 변수, 메서드는 사용 가능
		System.out.println(ahn.customerGrade);
		System.out.println(ahn.customerID);
		System.out.println(ahn.getCustomerName());
		//가상 메서드 : 재정의된 메서드(오버라이드)된 메서드는 하위 클래스의 메서드가 실행됩니다.
		System.out.println("상품의 가격은 "+ahn.calcPrice(10000)+"원 입니다.");
		
	}

}






