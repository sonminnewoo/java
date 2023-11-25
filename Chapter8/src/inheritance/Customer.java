package inheritance;

public class Customer {

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub

//	private int customerID;
//	private String customerName;
//	private String customerGrade;
//	위 모양은 자신의 클래스 내부에서 만 사용할수 있지만 ,
//	protected 상속받은 클래스 까지 사용할수 있다.
	
//	상속자 클래스에 공유되는 부분 
	
	protected int customerID;
	protected String customerName;
	protected String customerGrade;
	int bonusPoint;;
	double bonusRatio;
	

// 각 클래스 별 다름 
//	public Customer() {
//		customerGrade = "SILVER";
//		bonusRatio = 0.01;
//		System.out.println("Customer() 생성자 실행");
//	}
//	
//	아래를 사용 하면 위를 주석처리 한다 

	public Customer(int CustomerID, String customerName) {
		this.customerID = customerID;
		this.customerName = customerName;
		customerGrade = "SILVER";
		bonusRatio = 0.01;
//		System.out.println("Customer(int,String) 생성자 실행");
	}
	
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price;
	}
	

	public String showCustomerInfo() {
		return customerName + "님의 등급은"+ customerGrade+"이며"
				+ ", 보너스 포인트는 " +  bonusPoint + "입니다";
		//끝에 세미 콜론을 사용해야한다 
		
	}
	
//	자동 완성으로 나오게 된다
	
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
//}
