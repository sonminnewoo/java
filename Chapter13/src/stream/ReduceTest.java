package stream;

import java.util.Arrays;
import java.util.function.BinaryOperator;

class CompareString implements BinaryOperator<String> {
	
	@Override
	public String apply(String s1 , String s2 ) {
		// TODO Auto-generated constructor stub
		if(s1.getBytes().length >= s2.getBytes().length) {
			return s1;
		} else {
			return s2;
		}
	}
}

public class ReduceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] greetings = {"안녕하세요 ~~","hello","goodmornning^^^^^^^","반갑습니다"};
		System.out.println(Arrays.stream(greetings).reduce("", (s1,s2)->{
//			reduce("", (s1,s2) 부분의 s1 은 첫번째 리스트의 글자이고 그것과 s2 다음것들을 비교해서 더 큰것을 "" 에 reutrn 으로 넣는것 
			if(s1.getBytes().length >= s2.getBytes().length) {
		return s1;
			}else {
				return s2;
			}
	}));
	String str = Arrays.stream(greetings).reduce(new CompareString()).get();
	System.out.println(str);
	}
}
