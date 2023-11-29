package cooperation;

public class TakeTrans {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 택시 클래스 추가하기
		// Edward 학생이 택시를 타게되었습니다. 택시 요금은 10000원 입니다. Edward의 소지금은 15000원 입니다.
		// 위의 과정을 실행하기 위한 코드를 작성해보세요.
		Student james = new Student("James", 5000);
		Student tomas = new Student("Tomas", 10000);
		Student edward = new Student("Edward", 15000);
		
		Bus bus100 = new Bus(100);
		james.takeBus(bus100);
		james.showInfo();
		bus100.showInfo();
		
		Subway subwayGreen = new Subway(2);
		tomas.takeSubway(subwayGreen);
		tomas.showInfo();
		subwayGreen.showInfo();
		
		Texi texi1 = new Texi(1);
		edward.takeTexi(texi1);
		edward.showInfo();
		texi1.showInfo();
	}

}












