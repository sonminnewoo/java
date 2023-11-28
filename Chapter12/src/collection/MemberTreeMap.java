package collection;

import java.util.Comparator;
import java.util.TreeMap;

public class MemberTreeMap {
	private TreeMap<Integer,Member> treeMap;
	public MemberTreeMap() {
		treeMap = new TreeMap<Integer,Member>(new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return (o1 - o2)*-1;
			}
		});
	}
	
	public void addMember(Member member) {
		treeMap.put(member.getMemberId(), member);
	}
	
	public boolean removeMember(int memberId) {
		if(treeMap.containsKey(memberId)) {
			treeMap.remove(memberId);
			return true;
		}
		//hashMap.get(memberId);
		System.out.println(memberId + "가 존재하지 않습니다.");
		return false;
	}
	public void showAllMember() {
		// hashMap.values() : HashMap 안에있는 모든 value(값)을 가지고오는 메서드
		for(Member member : treeMap.values()) {
			System.out.println(member);
		}
//		Iterator<Integer> ir = hashMap.keySet().iterator();
//		while(ir.hasNext()) {
//			int key = ir.next();
//			Member member = hashMap.get(key);
//			System.out.println(member);
//		}
		System.out.println();
	}
}












