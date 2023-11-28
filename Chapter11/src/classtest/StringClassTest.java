package classtest;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class StringClassTest {

	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub
		Class strClass = Class.forName("java.lang.String");
		
		//생성자 이름 확인하기
		Constructor[] cons = strClass.getConstructors();
		for(Constructor c : cons) {
			System.out.println(c);
		}
		System.out.println();
		//필드 이름 확인하기
		Field[] fields = strClass.getFields();
		for(Field f : fields) {
			System.out.println(f);
		}
		System.out.println();
		
		//메서드 이름 확인하기
		Method[] methods = strClass.getMethods();
		for(Method m : methods) {
			System.out.println(m);
		}
	}

}












