package inheritance;

// extends Customer 으로 Customer 아래 주석 처리된 부분 
// 을 지워도 사용할수 있다 
// 이걸 사용할경우 private 을 protected 로 적어준다 
public class VVIPCustomer extends Customer {
	
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
	
	public VVIPCustomer() {
//		super : 자식(하위)클래스에서 사위(부모) 클래스 에 접근할때 사용한다
//	super(); 를 이용해서 부모 생성자 사용 
		
	super(0,"이름없음");
	customerGrade = "VVIP";
	bonusRatio = 0.2;
	saleRatio = 0.2;
//	System.out.println("VVIPCustomer() 생성자 실행");
	}
	
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price - (int)(price*saleRatio);
	}
	public int getAgentId() {
		return agentID;
	}

//public String showCustomerInfo() {
//	return customerName + "님의 등급은"+ customerGrade+"이며"
//			+ ", 보너스 포인트는 " +  bonusPoint + "입니다";
//	//끝에 세미 콜론을 사용해야한다 
//}

}
