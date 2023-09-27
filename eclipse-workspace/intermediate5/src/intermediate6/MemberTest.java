package intermediate6;

import java.util.Scanner;

public class MemberTest {

	public static void main(String[] args) {
		
		Member m1 = new Member();
		m1.setAge(22);
		System.out.println(m1.getAge());
		m1.setId("park");
		System.out.println(m1.getId());
		m1.setName("박길동");
		System.out.println(m1.getName());
		System.out.println(m1);
		
		
	}
	
}


