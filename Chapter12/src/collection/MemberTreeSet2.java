package collection;

import java.util.Iterator;
import java.util.TreeSet;

public class MemberTreeSet2{
	private TreeSet<Member2> treeSet;
	public MemberTreeSet2() {
		treeSet = new TreeSet<Member2>(new Member2());
	}
	
	public void addMember(Member2 member) {
		treeSet.add(member);
	}
	
	public boolean removeMember(int memberId) {
		//Iterator : 반복자 , set안에있는 데이터를 확인하고 하나식 꺼내서 사용할 수 있도록 하는 클래스
		// HashSet의 경우 인덱스를 이용한 get() 메서드가 없기 때문에 Iterator나 향상된 for문을 사용하셔야 합니다.
		Iterator<Member2> ir = treeSet.iterator();
		while(ir.hasNext()) { //다음데이터가 있는지 없는지를 확인 : 데이터가 존재하면 true 없다면 false
			Member2 member = ir.next(); // next() : 저장된 데이터를 하나씩 꺼내오는 메서드
			int tempId = member.getMemberId();
			if(tempId == memberId) {
				treeSet.remove(member);
				return true;
			}
		}
//		for(Member2 member : hashSet) {
//			int tempId = member.getMemberId();
//			if(tempId == memberId) {
//				hashSet.remove(member);
//				return true;
//			}
//		}
		System.out.println(memberId + "가 존재하지 않습니다.");
		return false;
	}
	public void showAllMember() {
		for(Member2 member : treeSet) {
			System.out.println(member);
		}
		System.out.println();
	}
}












