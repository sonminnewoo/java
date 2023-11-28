package collection;

public class MemberTreeSetTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MemberTreeSet2 memberHashSet = new MemberTreeSet2();
		
		Member2 lee = new Member2(1001, "이지원");
		Member2 son = new Member2(1002, "손민국");
		Member2 park = new Member2(1003, "박서훤");
		
		memberHashSet.addMember(lee);
		memberHashSet.addMember(son);
		memberHashSet.addMember(park);
		memberHashSet.showAllMember();
		
		Member2 hong = new Member2(1003, "홍길동");
		memberHashSet.addMember(hong);
		memberHashSet.showAllMember();
		
		memberHashSet.removeMember(1001);
		memberHashSet.showAllMember();
		System.out.println("asd");
		
	}

}





