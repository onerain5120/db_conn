package chapter12;

import java.util.HashSet;

public class StudentExample {

	public static void main(String[] args) {
	
		HashSet<Student> hashSet = new HashSet<Student>();
		
		Student s1 = new Student("1");
		Student s2 = new Student("1");
		Student s3 = new Student("2");
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		
		hashSet.add(s1);
		hashSet.add(s2);
		hashSet.add(s3);
		
		
		
		System.out.println("저장된 Student 수: " + hashSet.size());
		
		
		
	}
}
