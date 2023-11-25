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
//	(Ű�� , ������ü)
//		�� �� �ٸ� pur  ����
		
	}
	
	public boolean removeMember(int memberId){
		if(hashMap.containsKey(memberId)) {
			hashMap.remove(memberId);
		}
//		hashMap.get(memberId); �ε��� 1,2,3 
//		���� �Ʒ��� ���� �ؼ� �ۼ��Ҽ��ִ�
//		if(hashMap.containsKey(memberId)){
//			hashMap.remove(memberId);
//			return true;
//		}
//		
		System.out.println(memberId + "�� �������� �ʽ��ϴ�");
		return false;
	}
	
	public void showAllMember(){
//		hashMap.values() : HashMap �ȿ��ִ� ��� value(��)�� ��������� �޼���
		for(Member member : hashMap.values()) {
			System.out.println(member);
		}
//		Iterator<Integer> ir = hashMap.keySet().iterator();
//		hasNext���� �ؽ�Ʈ�� �ִ��� ������ Ȯ�� �ϴ� ��
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
