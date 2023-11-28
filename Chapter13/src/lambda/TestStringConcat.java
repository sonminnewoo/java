package lambda;

public class TestStringConcat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "Hello";
		String s2 = "world";
		StringConcatImpl concat1 = new StringConcatImpl();
		concat1.makeString(s1, s2);
		int i = 100;
		
		StringConcat concat2 = (s,v) -> {
			
			System.out.println(s+","+v);
		};
		concat2.makeString(s1, s2);
		
		
		
		StringConcat concat3 = (s,v) -> System.out.println(s+" , "+v);
		
//		사용하려면 오버라이드 
//		StringConcat에서 어떤 메소드를 사용해야하는지 모르기 때문에 오류 발생
//		public void makeString2(String s1, String s2); 이렇게 여러 메소드를 만들어도 실행 할수 없
		
//		위는 
//		람다식 인터페이스 구현
//		concat2.makeString(s1, s2);
		
		StringConcat concat4 = new StringConcat() {
			@Override
			public void makeString(String s1, String s2) {
				System.out.println(s1+","+s2);
				
			}
//			@Override
//			public void makeString2(String s1, String s2) {
//				// TODO Auto-generated method stub
//				System.out.println(s1+","+s2);
//			}
			
		};
		concat3.makeString(s1, s2);
	}

}
