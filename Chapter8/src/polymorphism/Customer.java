package polymorphism;

public class Customer {
	
	public double saleRatio;
	protected int customerID;
	protected String customerName;
	protected String customerGrade;
	public int bonusPoint;
	public double bonusRatio;
	
	public Customer() {
		initCustomer();
	}
	
	public Customer(int customerID, String customerName) {
		this.customerID = customerID;
		this.customerName = customerName;
		initCustomer() ;
	}
	
//	init : 이니셜 라이즈 초기화라는 의미의 글자이다 
	
	private void initCustomer() {
		customerGrade = "none";
		bonusRatio = 5;
		saleRatio = 0.1;
		}

	public int calcPrice(int price) {
		bonusPoint += price*bonusRatio;
		return price;
	}
	public String showCustomerInfo() {
		return customerName+" 님의 등급은 "+customerGrade+"이며"+
				"보너스 포인트는"+bonusPoint+"입니다";
	}
}
