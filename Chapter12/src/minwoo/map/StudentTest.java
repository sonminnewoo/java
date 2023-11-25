package minwoo.map;

import java.util.HashSet;

class Student {

	String key ;
	String name ;

	public Student(String key, String name) {
		// TODO Auto-generated constructor stub
		this.key = key;
		this.name = name;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return key +":"+ name;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student student = (Student)obj;
			if(this.key.equals(student.key))
				return true;
			else 
				return false;
		}
		return false;
	}
}
// 	이렇게 쓰는건 맞고. 확인 해보겠다고 하심 

public class StudentTest {

	public static void main(String[] args) {
		
	HashSet<Student> set = new HashSet<Student>();
	
	set.add(new Student("100","홍길동"));
	set.add(new Student("200","강감찬"));
	set.add(new Student("300","이순신"));
	set.add(new Student("400","정약용"));
	set.add(new Student("100","송중기"));

	System.out.println(set);
	
	}
}
