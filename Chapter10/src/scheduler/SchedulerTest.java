package scheduler;

import java.io.IOException;

public class SchedulerTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
//		throws 는 뒤로 넘기기 IOException 은 System.in.read(); 의 자동완성 예외처리
		System.out.println("전화 상담 할당 방식을 선택하세요.");
		System.out.println("R : 한명씩 차례대로 할당");
		System.out.println("L : 쉬고 있거나 대기가 가장 적은 상담원에게 할당");
		System.out.println("P : 우선 순위가 가장 높은 고객 먼저 할탕");
		
		int ch = System.in.read();
//		위 System.in.read(); 이건 예외 처리 해줘야함
		Scheduler scheduler = null;
		
		if(ch=='R' || ch=='r') {
			scheduler = new RoundRobin();
		}else if(ch=='L' || ch=='l') {
			scheduler = new LeastJob();
		}else if(ch=='P' || ch=='p') {
			scheduler = new PriorityAllocation();
		}else if(ch=='A' || ch=='a') {
			scheduler = new AgentGetCall();
		}else {
		System.out.println("지원되지 않는 기능 입니다.");
		return;
			// 여기 리턴 넣어서 밑에 스케쥴 메서드를 불러오지 않고 메인 메소드로 반환 하는것 
//			리턴이 없으면 값이 없는것은 에러가 발생하게 된다
		}
		
		scheduler.getNextCall();
		scheduler.sendCallToAgent();
				 
	}

}
