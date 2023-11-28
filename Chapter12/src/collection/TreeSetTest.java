package collection;

import java.util.TreeSet;

public class TreeSetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//TreeSet : 자료의 중복을 허용하지 않으며 출력 결과값을 정렬하는 클래스
		TreeSet<String> treeSet = new TreeSet<String>();
		treeSet.add("홍길동");
		treeSet.add("홍길동");
		treeSet.add("강감찬");
		treeSet.add("강감찬");
		treeSet.add("이순신");
		treeSet.add("이순신");
		System.out.println(treeSet);
		
		TreeSet<Integer> integerTreeSet = new TreeSet<Integer>();
		integerTreeSet.add(23);
		integerTreeSet.add(10);
		integerTreeSet.add(48);
		integerTreeSet.add(15);
		integerTreeSet.add(7);
		integerTreeSet.add(56);
		System.out.println(integerTreeSet);
	}

}





