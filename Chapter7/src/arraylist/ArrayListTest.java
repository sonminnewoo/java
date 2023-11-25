package arraylist;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> strList = new ArrayList<String>(); // 배열과 다르게 이 프로그램 두번째 구문 같이 임포트가 필요하다 
		
		//객체 를 <> 넣어 사용할수 있다 .
		
		
		// <> 로 된부분이 제너릭이라하고 이부분은 어떤 자료형을 넣을수 있다. int 는 그대로 못넣고 'Integer' 라고 해야한다 
		// 그러나 더블 같은경우는 'Double' 로 한다 첫글자를 모두 대문자로 해야한다 .
		
		//add() : ArrayList에 데이터를 저장하는 메서드 
		strList.add("태백산맥"); // 어레이는 add 로 값을 넣는다, 배열과 다르다 
		strList.add("데미안");
		strList.add("어떻게 살것인가");
		strList.add("토지");
		strList.add("어린 왕자");

		//size() : ArrayList에 저장된 데이터의 갯수 를 반환하는 메서드
		System.out.println(strList.size());
		//출력
		for(int i =0 ; i<strList.size(); i++) { // ArrayList 같은 경우 사용된 사이즈만큼만 반환한다 
			//get() : ArrayList의 데이터를 가지고 오는 메서드 , 인덱스를 사용
			System.out.println(strList.get(i)); // 0 부터 태백산맥, 데미안 순이다 !
		}
		//toString() 기본자료형의 경우 저장되어있는 모든 데이터를 출력
		System.out.println(strList.toString()); // [] 안에 글자를 넣어출력한다 , 이것도 메모리가 아니라 메모리 주소를 반환해서 
		// System.out.println 으로 주소 안의 데이터 가 출력하게됨
		System.out.println("=====향상된 for문, foreach문 이라고도 한다"); 
		for(String str : strList) {
			System.out.println(str);
		}
		
	}

}
