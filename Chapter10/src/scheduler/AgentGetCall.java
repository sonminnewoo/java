package scheduler;

public class AgentGetCall implements Scheduler {
	
	public void getNextCall() {
		System.out.println("안녕");
	}
	@Override
	public void sendCallToAgent() {
		// TODO Auto-generated method stub
		System.out.println("디지몬");
	}
}
