package bookshelf;

public class BookShelfTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue shelfQueue = new BookShelf();
		shelfQueue.enQueue("태백산맥 1");
		shelfQueue.enQueue("태백산맥 2");
		shelfQueue.enQueue("태백산맥 3");
		System.out.println(shelfQueue.deQueue());
		System.out.println(shelfQueue.deQueue());
		System.out.println(shelfQueue.deQueue());
		
		Stack shelfStack = new BookShelf();
		shelfStack.push("태백산맥1");
		shelfStack.push("태백산맥2");
		shelfStack.push("태백산맥3");
		System.out.println(shelfStack.pop());
		System.out.println(shelfStack.pop());
		System.out.println(shelfStack.pop());
	}

}









