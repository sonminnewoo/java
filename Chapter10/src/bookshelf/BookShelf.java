package bookshelf;

public class BookShelf extends Shelf implements Queue {
	@Override
	public void enQueue(String title) {
		// TODO Auto-generated method stub
		shelf.add(title);
	}

	@Override
	public String deQueue() {
		// TODO Auto-generated method stub
		return shelf.remove(0);
//		remove 을 실행하면 0 을 삭제하고 그자리에 실행값을 적는다
	}

	@Override
	public int getSize() {
		// TODO Auto-generated method stub
		return getCount();
//		 아래도 동일
//		return shelf.size();
	}
}
