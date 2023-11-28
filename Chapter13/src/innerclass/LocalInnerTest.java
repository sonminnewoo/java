package innerclass;

class Outter{
	
	int outNum = 100;
	static int sNum = 200;
	
		
	Runnable getRunnable(int i){

		int num = 100; // 지역변수,매개변수 상수(final) 변하게 되어 내부 클래스 안에서는
		//변경할수 없음 , 사용은 가능하지만 변경할수 없음 .
		
		class MyRunnable implements Runnable{
//			implements 로 인터페이스 파일 사용 
			
			int localNum = 10;
				
			@Override
			public void run() {
				//num = 200;   : 주석처리 풀변 상수여서 변경할수없어서 에러 발생
				//i = 100; 
				System.out.println("i =" + i); 
				System.out.println("num = " +num);  
				System.out.println("localNum = " +localNum);
				System.out.println("outNum = " + outNum );
				System.out.println("Outter.sNum = " + Outter.sNum );
				}
			}
		 return new MyRunnable();
//		 클래스 MyRunnable(); 를 생성하면서 인스턴스를 돌려주는 메서드 
	}
}

public class LocalInnerTest {

	public static void main(String[] args) {

		Outter out = new Outter();
		Runnable runner = out.getRunnable(10);
		runner.run();
	}
}
