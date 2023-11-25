package array;

class student2 {

	private String stuentName;
	private int stuentNum;

	public student2() {
		stuentNum = 0;
		stuentName = "";
	}

	public student2(int stuentNum, String stuentName) {
		this.stuentNum = stuentNum;
		this.stuentName = stuentName;
	}

	// 출력 형식 정함
	public void showInfo() {
		System.out.println(stuentNum + "," + stuentName);
	}

	public String getStuentName() {
		return stuentName;
	}

	public void setStuentName(String stuentName) {
		this.stuentName = stuentName;
	}

	public int getStuentNum() {
		return stuentNum;
	}

	public void setStuentNum(int stuentNum) {
		this.stuentNum = stuentNum;
	}

}

public class StudentTest {

	public static void main(String[] args) {

		student2 studentss = new student2();
		studentss.showInfo();

		// TODO Auto-generated method stub
		// student클래스를 만들고 멤버 변수로 studentId, studentName을 선언합니다 .
		// StudentArr 배열에 1001, tomas 1002, jame 1003, Edward 를
		// 저장하고 출력하는 프로그램 을 만들어 보세요
		// 출력 결과는
		// 1001, tomas
		// 1002, jame
		// 1003, Edward

		student2[] students12 = new student2[3];
		students12[0] = new student2(1001,"tomas");
		students12[1] = new student2(1002,"jame");
		students12[2] = new student2(1003,"Edward");
		// ★ 배열의 크기 를 벗어나는 인덱스 를 사용하면 출력이 제대로 안될수 있다 !!!

		for (int i = 0; i < students12.length; i++) {  // 길이가 계속 변할수 있기 때문에 
			// 3 같은 값을 입력하기 보다는 배열 의 길이를 지정 해준다!!!!!!
			students12[i].showInfo();

		}

	}

}
