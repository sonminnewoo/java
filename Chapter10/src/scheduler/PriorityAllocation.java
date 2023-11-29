package scheduler;

public class PriorityAllocation implements Scheduler{

	@Override
	public void getNextCall() {
		// TODO Auto-generated method stub
		System.out.println("고객 등급이 높은 고객의 전화를 먼저 가져옵니다.");
	}

	@Override
	public void sendCallToAgent() {
		// TODO Auto-generated method stub
		System.out.println("업무 Skill이 높은 상담원에게 우선적으로 배분합니다.");
	}

}
