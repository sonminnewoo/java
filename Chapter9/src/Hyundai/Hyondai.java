package Hyundai;

public abstract class Hyondai {
	public abstract void bodyType(); // 차종 : 경형,중형,대형 (하위,자손 결정)
	public abstract void FuelEfficiency(); // 연료효율 : 1,2,3 등급 (하위,자손 결정)
	public abstract void CarName(); // 옵션 구성 (하위,자손 결정)
	public void Brand() {
		System.out.println("Hyondai");
	} // 제조사(객체의 공통 사항, 상위의 특징)
}
