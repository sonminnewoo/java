package collection;

public class MemberTreeSetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MemberTreeSet memberHashSet = new MemberTreeSet();
		
		Member lee = new Member(1001, "이지원");
		Member son = new Member(1002, "손민국");
		Member park = new Member(1003, "박서훤");
		
		memberHashSet.addMember(lee);
		memberHashSet.addMember(son);
		memberHashSet.addMember(park);
		memberHashSet.showAllMember();
		
		Member hong = new Member(1003, "홍길동");
		memberHashSet.addMember(hong);
		memberHashSet.showAllMember();
		
		memberHashSet.removeMember(1001);
		memberHashSet.showAllMember();
		System.out.println("asd");
		
	}

}





