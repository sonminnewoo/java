package polymorphism;

public class VIPCustomer extends Customer{
	private int agentID;
	public double saleRatio;
	
	public VIPCustomer(int customerID, String customerName, int agentID) {
		super(customerID, customerName);
//		상위 클래스의 생성자를 호출 .
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
		this.agentID = agentID;
	}
	@Override
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price - (int)(price*saleRatio);
	}
	
	@Override
	public String showCustomerInfo() {
		return super.showCustomerInfo() + " 담당 상담원 번호는 "+agentID+" 입니다.";
	}
	
	public int getAgentID() {
		return agentID;
	}
}












