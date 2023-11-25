package finaltest;

public class Constant {

	int num = 10;
	final int NUM = 100;
	// 단어와 단어 이을때 _ 이용 , final 이라고 하면 초기화 할때 이후 수정이 불가하다

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Constant cons = new Constant();
		cons.num = 50;
//		cons.NUM = 200;
		
		System.out.println(cons.num);
		System.out.println(cons.NUM);
		System.out.println("파이의 값은"+Define.PI);
	}

}
