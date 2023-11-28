package collection;

public class MemberHashMapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MemberHashMap memberHashMap = new MemberHashMap();
		
		Member lee = new Member(1001, "이지원");
		Member son = new Member(1002, "손민국");
		Member park = new Member(1003, "박서훤");
		
		memberHashMap.addMember(lee);
		memberHashMap.addMember(son);
		memberHashMap.addMember(park);
		memberHashMap.showAllMember();
		
		Member hong = new Member(1003, "홍길동");
		memberHashMap.addMember(hong);
		memberHashMap.showAllMember();
		
		memberHashMap.removeMember(1001);
		memberHashMap.showAllMember();
		
	}

}





