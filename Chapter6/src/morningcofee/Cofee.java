package morningcofee;

public class Cofee {
	
	public static void main(String[] args ) {
	
		Person kim = new Person("Kim", 5000);
		Person lee = new Person("Lee", 10000);
		
		CafeStar star4000 = new CafeStar(10);
		kim.takeStar(star4000);
		kim.showInfo();
		star4000.showInfo();
		
		CafeStar star4500 = new CafeStar(1);
		kim.takeKong(star4500);
		kim.showInfo();
		star4500.showInfo();
		
	}
	
}
