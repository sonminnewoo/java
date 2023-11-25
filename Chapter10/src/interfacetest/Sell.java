package interfacetest;

public interface Sell {
	void sell();
	
	default void order() {
		System.out.println("고객 판매 주문 ");
	}
}
