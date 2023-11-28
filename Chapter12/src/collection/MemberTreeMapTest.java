package collection;

import java.util.Comparator;



public class MemberTreeMapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MemberTreeMap memberTreeMap = new MemberTreeMap();
		
		Member lee = new Member(1001, "이지원");
		Member son = new Member(1002, "손민국");
		Member park = new Member(1003, "박서훤");
		
		memberTreeMap.addMember(park);
		memberTreeMap.addMember(lee);
		memberTreeMap.addMember(son);
		
		memberTreeMap.showAllMember();
		
		Member hong = new Member(1003, "홍길동");
		memberTreeMap.addMember(hong);
		memberTreeMap.showAllMember();
		
		memberTreeMap.removeMember(1001);
		memberTreeMap.showAllMember();
		
	}

}





