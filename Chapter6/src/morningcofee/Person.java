package morningcofee;

public class Person {

		public String Person;
		public int monye; 
		
		public Person (String Person, int money) {
			this.Person = Person;
			this.monye = monye;
		}
		
		public void takeStar(CafeStar star) {
			star.take(4000);
			this.monye -= 4000;
		}
		public void takeKong(CafeStar subway) {
			subway.take(4500);
			this.monye -= 4500;
		}
		
		public void showInfo() {
			System.out.println(Person + "님의 남은 돈은 " + monye + "입니다.");
		}
}