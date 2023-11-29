package polymorphism;

public class GoldCustomer extends Customer{
	public double saleRatio;
	
	public GoldCustomer(int customerID, String customerName) {
		super(customerID, customerName);
		customerGrade = "Gold";
		bonusRatio = 0.05;
		saleRatio = 0.05;
	}
	
	@Override
	public int calcPrice(int price) {
		bonusPoint += price*bonusRatio;
		return price - (int)(price * saleRatio);
	}
}










