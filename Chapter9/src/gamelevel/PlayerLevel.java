package gamelevel;

public abstract class PlayerLevel {
	//초급자 레벨 : 천천히 달릴 수 있습니다.(run)
	//중급자 레벨 : 빠르게 달리고(run) 점프(jump)할 수 있습니다.
	//고급자 레벨 : 엄청 빠르게 달리고 점프하고 턴할 수 있습니다.
	
	public abstract void run();
	public abstract void jump();
	public abstract void turn();
	public abstract void showLevelMessage();
	
	final public void go(int count) {
		run();
		for(int i=0; i<count; i++) {
			jump();
		}
		turn();
	}
}





