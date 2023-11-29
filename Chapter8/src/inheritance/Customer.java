package inheritance;

public class Customer {
	//protected : 상속을 받은 클래스는 사용할 수 있도록 하는 접근 제어자
	protected int customerID; // 고객 아이디
	protected String customerName; // 고객 이름
	protected String customerGrade; //고객 등급
	int bonusPoint; //적립금
	double bonusRatio; //적립 비율
	
//	public Customer() {
//		customerGrade = "SILVER";
//		bonusRatio = 0.01;
//		System.out.println("Customer() 생성자 실행");
//	}
	
	public Customer(int customerID, String customerName) {
		customerGrade = "SILVER";
		bonusRatio = 0.01;
		this.customerID = customerID;
		this.customerName = customerName;
		//System.out.println("Customer(int, String) 생성자 실행");
	}
	
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price;
	}
	
	public String showCustomerInfo() {
		return customerName + " 님의 등급은 "+customerGrade+" 이며"
				+ ", 보너스 포인트는" +bonusPoint+" 입니다.";
				
	}
	public int getCustomerID() {
		return customerID;
	}
	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerGrade() {
		return customerGrade;
	}
	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}
	public int getBonusPoint() {
		return bonusPoint;
	}
	public void setBonusPoint(int bonusPoint) {
		this.bonusPoint = bonusPoint;
	}
	public double getBonusRatio() {
		return bonusRatio;
	}
	public void setBonusRatio(double bonusRatio) {
		this.bonusRatio = bonusRatio;
	}
	
}









