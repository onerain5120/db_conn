package base_ex2;


// 이 클래스(class)로부터 나온 객체가 진정한 동등 객체인지 확인하는 방법은 
// 이 클래스 내에 hashCode()와 equals()를 아래의 코드 형태로 재정의 해놔야 함
public class Student {
	
	
	// 필
	private final int age;
	private final String name;
	
	
	// 생
	public Student(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}
	
	
	// 메  
	public int getAge() {  // 게터만 가져옴
		return age;
	}
	
	public String getName() {  // 게터만 가져옴
		return name;
	}
	
	
	
	
	// 이 클래스를 이용해서 만들어진 객체가 진정한 동등 객체인지(hashCode() 리턴값도 같고 equals() 리턴값이 같다.) 확인해주는 코드를 재정의
	
	// 같은 학생이지 여부를 확인하는 방법으로 hashCode()를 재정의함
	@Override
	public int hashCode() {

		int hashCode = this.age + name.hashCode(); // 1 + 54150062
		
		return hashCode;
	}
	
	
	@Override
	public boolean equals(Object obj) {
		
		if(obj instanceof Student stu) {
			if(this.age == stu.getAge() && this.name.equals(stu.getName())) {
				return true;
			}
		}
		
		
		return false;
	}
	
	@Override
	public String toString() {
		return "학생 나이는 " + this.age + "이고, " + "학생 이름은 " + this.name + "입니다.";
	}
	

	
	

}
