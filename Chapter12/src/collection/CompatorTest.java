package collection;

import java.util.Comparator;
import java.util.TreeSet;

class MyCompare2 implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {
		// TODO Auto-generated method stub
		//문자열의 내림차순 정렬
		return o1.compareTo(o2) * -1;
	}
	
}

public class CompatorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> set = new TreeSet<String>(new MyCompare2());
		set.add("ccc");
		set.add("aaa");
		set.add("ddd");
		set.add("bbb");
		System.out.println(set);
	}

}










