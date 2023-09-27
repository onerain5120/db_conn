package intermediate7;

import lombok.Data;

// id는 값을 절대 바꿀 수 없게 하고 싶고
// name은 null이 들어가지 않도록 하고 싶음


@Data  //@Getter, @ Setter, @ToString 대체
public class Member {

	private final String Id;  // final 필드는 변경할 수 없음(Setter가 만들어지지 않음)
	private String name;
	private int age;

	
	public Member() {
		this.Id = "hong";
	}
}
