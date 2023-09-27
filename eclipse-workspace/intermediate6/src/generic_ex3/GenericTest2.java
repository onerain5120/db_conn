package generic_ex3;

public class GenericTest2 {

	public static void main(String[] args) {
		
		// 모든 사람 등록
		Course.registerCourse1(new Applicant<Person>(new Person()));
		
		Course.registerCourse1(new Applicant<Student>(new Student()));
		
		
		
		// 학생만 등록
//		Course.registerCourse2(new Applicant<Person>(new Person()));	
//		Course.registerCourse2(new Applicant<Worker>(new Worker()));
		Course.registerCourse2(new Applicant<Student>(new Student()));
		Course.registerCourse2(new Applicant<HighStudent>(new HighStudent()));
		Course.registerCourse2(new Applicant<MiddleStudent>(new MiddleStudent()));
		
		// 직장인 및 일반인(Person) 등록 가능
		Course.registerCourse3(new Applicant<Person>(new Person()));
		Course.registerCourse3(new Applicant<Worker>(new Worker()));
//		Course.registerCourse3(new Applicant<Student>(new Student()));
//		Course.registerCourse3(new Applicant<HighStudent>(new HighStudent()));
//		Course.registerCourse3(new Applicant<MiddleStudent>(new MiddleStudent()));
		
	}
}


