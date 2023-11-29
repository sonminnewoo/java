package inheritance;

public class VIPCustomer extends Customer {
//	private int customerID; // 고객 아이디
//	private String customerName; // 고객 이름
//	private String customerGrade; //고객 등급
//	int bonusPoint; //적립금
//	double bonusRatio; //적립 비율
//	
	public int agentID; // VIP고객 담당 상담원
	double saleRatio; // 할인율

	public VIPCustomer() {
		// super : 자식(하위)클래스에서 상위(부모)클래스에 접근할 때 사용합니다.
//		super(); // super를 이용해 생성자 사용
//		System.out.println(super.customerID); // super를 이용해 멤버변수 사용
//		super.showCustomerInfo(); //super를 이용해 메서드 사용
		// 상속받은 부모 클래스의 생성자는 반드시 실행되어야 합니다.
		// 기본 생성자가 없는 경우 직접 super를 이용해 생성자를 실행 해주셔합니다.
		super(0, "이름없음");
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
		//System.out.println("VIPCustomer() 생성자 실행");
	}
	public VIPCustomer(int customerID, String customerName) {
		super(customerID, customerName);
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
	}

	// 메서드 재정의 : 메서드 오버라이드
	// 상위 클래스에 존재하는 메서드를 하위 클래스에 수정하여 사용할 수 있도록 하는 기능
	@Override
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price - (int)(price*saleRatio);
	}
	
	// 메서드 오버 로드
	// 메서드를 같은 이름으로 여러개 만들수 있도록 하는 기능
	// 매개변수의 개수와 자료형이 다를 경우에 다른 메서드로 인식하게 됩니다.
	public void showInfo() {}
	public void showInfo(int i) {}
	public void showInfo(int i, int j) {}
	public void showInfo(String str) {}
	public void showInfo(String str, String str2) {}
	public void showInfo(String str, int i2) {}

	public int getAgentID() {
		return agentID;
	}

//	public String showCustomerInfo() {
//		return customerName + " 님의 등급은 "+customerGrade+" 이며"
//				+ ", 보너스 포인트는" +bonusPoint+" 입니다.";
//				
//	}
}
