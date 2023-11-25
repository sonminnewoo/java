package interfacetest;

public interface Buy {
	void buy();
	
	default void order() {
		System.out.println("고객 판매 주문 ");
	}
}
