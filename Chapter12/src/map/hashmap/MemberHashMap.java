package map.hashmap;

import java.util.HashMap;
import java.util.Iterator;

import collection.Member;

public class MemberHashMap {

	private HashMap<Integer, Member> hashMap;
	
	public MemberHashMap()
	{
		hashMap = new HashMap<Integer, Member>();
	}
	
	public void addMember(Member member){
		
		hashMap.put(member.getMemberId(), member);
//	(키값 , 벨류자체)
//		겟 과 다른 pur  형태
		
	}
	
	public boolean removeMember(int memberId){
		if(hashMap.containsKey(memberId)) {
			hashMap.remove(memberId);
		}
//		hashMap.get(memberId); 인덱스 1,2,3 
//		위는 아래를 변형 해서 작성할수있다
//		if(hashMap.containsKey(memberId)){
//			hashMap.remove(memberId);
//			return true;
//		}
//		
		System.out.println(memberId + "가 존재하지 않습니다");
		return false;
	}
	
	public void showAllMember(){
//		hashMap.values() : HashMap 안에있는 모든 value(값)을 가지고오는 메서드
		for(Member member : hashMap.values()) {
			System.out.println(member);
		}
//		Iterator<Integer> ir = hashMap.keySet().iterator();
//		hasNext다음 넥스트가 있는지 없는지 확인 하는 것
//		while(ir.hasNext()) {
//			int key = ir.next();
//			Member member = hashMap.get(key);
//			System.out.println(member);
//		}
//		while (ir.hasNext()){
//			int key = ir.next();
//			Member member = hashMap.get(key);
//			System.out.println(member);
//		}	
		System.out.println();
	}
}
