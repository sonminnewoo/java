package bookshelf;

public class BookShelf extends Shelf implements Queue, Stack{

	@Override
	public void enQueue(String title) {
		shelf.add(title);
	}

	@Override
	public String deQueue() {
		// TODO Auto-generated method stub
		return shelf.remove(0);
	}

	@Override
	public int getSize() {
		// TODO Auto-generated method stub
		return getCount();
	}

	@Override
	public void push(String title) {
		// TODO Auto-generated method stub
		shelf.add(title);
	}

	@Override
	public String pop() {
		// TODO Auto-generated method stub
		return shelf.remove(shelf.size()-1);
	}
	
}







