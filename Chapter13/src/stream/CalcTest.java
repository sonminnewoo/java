package stream;

public class CalcTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calc minwoo = (x,y) -> x + y ; //(x,y) -> x >= y ? x : y;  이렇게 하면 x가크면 x 반환
		System.out.println(minwoo.add(40,20));
	}

}
