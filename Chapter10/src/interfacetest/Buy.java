package interfacetest;

public interface Buy {
	void buy();
	
	default void order() {
		System.out.println("Buy 고객 구매 주문");
	}
}
