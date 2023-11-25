package collection;

public class MemberHashSetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MemberHashSet memberHashSet = new MemberHashSet();
		
		Member memberlee = new Member(1001, "이지원");
		Member memberson = new Member(1002, "손민국");
		Member memberpark = new Member(1003, "박서현");
		
		memberHashSet.addMember(memberlee);
		memberHashSet.addMember(memberson);
		memberHashSet.addMember(memberpark);
		
		memberHashSet.showAllMember();
		
		Member memberHong = new Member(1003,"홀길동");
		memberHashSet.addMember(memberHong);
		memberHashSet.showAllMember();
		
	}

}
