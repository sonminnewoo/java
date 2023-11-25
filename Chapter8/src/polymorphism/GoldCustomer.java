package polymorphism;

public class GoldCustomer extends Customer {
	
	public double saleRatio;
	public int agentID;
	//!agentID 를 선언하지않았다
	public GoldCustomer(int customerID, String customerName,int agentID) {
		super(customerID,customerName);
		customerGrade = "Gold";
		bonusRatio = 0.1;
		saleRatio = 0.1;
		this.agentID = agentID;
	}
//	agentID 를 {} 안에서 사용하는데 매개 변수에 추가하지않았다 
//	오버로드 된것은 언제나 자시그이 것을 가져 오기 때문에 부모를 변경해도 오류가 없다 
	
	@Override
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price - (int)(price*saleRatio);
	}
	@Override //@Override 되지 않는 것위에 이렇게 적으면 오류가 뜬다 
	public String showCustomerInfo() {
//		이렇게 super 로 상위 부모의 변수나 메서드를 들고 올수 있다
		return super.showCustomerInfo()+"담당 상담원 번호는"+agentID+"입니다.";
	}
	public int getAgentID() {
		return agentID;
	}
	
}
