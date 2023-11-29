package template;

public class AICar extends Car{

	@Override
	public void drive() {
		// TODO Auto-generated method stub
		System.out.println("자율 주행을 합니다.");
		System.out.println("자동차가 알아서 방향을 전환합니다.");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("스스로 멈춥니다.");
	}

	@Override
	public void wiper() {
		// TODO Auto-generated method stub
		System.out.println("비나 눈이오면 자동으로 와이퍼를 작동합니다.");
	}
	
	
}















