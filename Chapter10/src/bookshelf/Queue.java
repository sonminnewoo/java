package bookshelf;

public interface Queue {

	void enQueue(String title);
// Queue 제일 상단을 꺼내는것

	String deQueue();

	int getSize();
}
