package inheritance;

// extends Customer 으로 Customer 아래 주석 처리된 부분 
// 을 지워도 사용할수 있다 
// 이걸 사용할경우 private 을 protected 로 적어준다 
public class VIPCustomer extends Customer {
	
//	public static void main(String[] args) {
//	// TODO Auto-generated method stub

//	private int customerID;
//	private String customerName;
//	private String customerGrade;
//	int bonusPoint;;
//	double bonusRatio;
//	private int agentID; //VIP 고객 담당 상담원
//	double saleRatio; // 할인율
	
	public int agentID; //VIP 고객 담당 상담원
	double saleRatio; // 할인율
	
	public VIPCustomer(int customerID, String customerName) {
//		super : 자식(하위)클래스에서 사위(부모) 클래스 에 접근할때 사용한다
//		super(); 를 이용해서 부모 생성자 사용 
//	싱속받은 부모 클래스의 생상자는 반드시 실행되어야 합니다.
//		기본 생성자가 없는 경우 직접 super를 이용해 생성자를 실행해주셔야 합니다.
//		오버로드 . 여러가지 같은 기능의 다른 ㄱ
	super(0,"이름없음");
	customerGrade = "VIP";
	bonusRatio = 0.1;
	saleRatio = 0.1;
//	System.out.println("VIPCustomer() 생성자 실행");
	}
	
//	메서드 재정의 : 매서드 오버라이드
//	자식에서 부모에서 존재하는 메서드를  긁어봐서 하위 하위 클래스에 수정하여
//	사용할수 있도록 하는 기능 
	
//	@Override
//	public int calcPrice(int price) {
//		// TODO Auto-generated method stub
//		return super.calcPrice(price);
//	}
	
	@Override
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price - (int)(price*saleRatio);
	}
//	메서드 오버 로드
//	메서드를 같은이름으로 여러개 만들수 있도록 하는 기능 
//	매개변수의 개수와 자료형이 다를 경우에 다른 메서드로 인식하게 됩니다.
//	CustomerTest 에서 계속 설명 !
	public void showInfo() {
		
	}
	public void showInfo(int i) {
		
	}
	public void showInfo(String i) {
		
	}
	public void showInfo(int i, int j) {
		
	}
//	위자체 내용을 메서드 오버로드 라고 한다 . 종류,개수,의구분으로 
//	다른 것으로 인식하게 하는것 
	
	public int getAgentId() {
		return agentID;
	}

//public String showCustomerInfo() {
//	return customerName + "님의 등급은"+ customerGrade+"이며"
//			+ ", 보너스 포인트는 " +  bonusPoint + "입니다";
//	//끝에 세미 콜론을 사용해야한다 
//}

}
