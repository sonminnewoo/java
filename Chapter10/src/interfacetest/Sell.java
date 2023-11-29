package interfacetest;

public interface Sell {
	void sell();
	
	default void order() {
		System.out.println("Sell 고객 판매 주문");
	}
}
