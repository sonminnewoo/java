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
// 	�̷��� ���°� �°�. Ȯ�� �غ��ڴٰ� �Ͻ� 

public class StudentTest {

	public static void main(String[] args) {
		
	HashSet<Student> set = new HashSet<Student>();
	
	set.add(new Student("100","ȫ�浿"));
	set.add(new Student("200","������"));
	set.add(new Student("300","�̼���"));
	set.add(new Student("400","�����"));
	set.add(new Student("100","���߱�"));

	System.out.println(set);
	
	}
}
