package intermediate8;

public class MemberTest {

	
	public static void main(String[] args) {
		
		Member m1 = new Member();
		
//		m1.setId("hong");
		System.out.println(m1.getId());
		
		System.out.println(m1.toString());
		
		
		
		try {
			m1.setName(null);			
		} catch (NullPointerException e) {
			System.out.println("이름에는 null 절대 안됨");
		}
		
	}
}
