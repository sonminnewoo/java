package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ArrayListStreamTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> sList = new ArrayList<String>(); 

		
		sList.add("Tmas");
		sList.add("Edward");
		sList.add("Jack");
		
		Stream<String> stream = sList.stream();// 스트림을 변수로 만들어 사용하더라도 재사용이 불가능 합니다
//		위 부분을 스트림 을 사용하는건데 , 이걸 두번 실행할수 없다.
		stream.forEach(s -> System.out.print(s + " ")); 
		System.out.println();
//		stream.forEach(s -> System.out.print(s + " ")); 
//		System.out.println();
//		위부분을 실행하면 오류가 발생한다
		
		sList.stream().forEach(s -> System.out.println(s));
		sList.stream().forEach(s -> System.out.println(s));
		
		for(String str : sList) {
			System.out.println(str);
		}
	}

}
