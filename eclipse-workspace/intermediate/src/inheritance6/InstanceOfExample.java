package inheritance6;

public class InstanceOfExample {
	
	
	
	public static void personInfo(Person person) {
		System.out.println(person.name);
		person.walk();
		
		
		// 자바 11까지 문법
		if(person instanceof Student) {
			//Student 객체일 경우 강제 타입 변환
			Student student = (Student)person;
			System.out.println(student.studentNo);
			student.study();
		}
		
		
		// 자바 12부터는 
		if(person instanceof Student student) {
			//Student 객체일 경우 강제 타입 변환
//			Student student = (Student)person;
			System.out.println(student.studentNo);
			student.study();
		}
		
	}
	
	
	public static void main(String[] args) {
		
		
//		Person person = new Person("홍길동");
//		personInfo(person);
//		
//		System.out.println("================");
		
		Person p2 = new Student("김길동", 10);
		
//		Person p2 = new Person("김길동");
		
		System.out.println(p2 instanceof Student);
		Student p3 = (Student)p2;
		System.out.println(p2 instanceof Person);
		
		
//		personInfo(p2);
				
		

//		System.out.println(person instanceof Person);
//		Student student1 = new Student();
//		System.out.println(student1 instanceof Person);
//		System.out.println(person instanceof Student);
		
		

		
		
		
		
	}

}
