package nested6;

public class Button {

	// 클래스와 클래스간의 관계(상속, 사용, 포함(클래스 안의 필드로서 선언))
	// 버튼이라는 클래스 안에서 인터페이스를 동작시켜야 하므로 포함관계로 선언
	
	 private ClickListener clickListener;
	
	
	
	// 중첩 인터페이스 (클래스 안의 멤버로서 인터페이스가 들어간 형태도 됨), 주로 안드로이드 이벤트 처리 목적
	// 클릭 리스너라는 것은 클릭이라는 이벤트가 일어났을 때를 기다리고 듣고 있는 인터페이스이므로 클릭(이벤트)이 일어났을 때라는 메소드를 일단 던져놔야 함
	public static interface ClickListener {
		// 상수
		
		
		// 추상메서드
		public abstract void onClick();
		
		// 디
		
		// 정
	}
	
	// setter
	public void setClickListener(ClickListener clickListener) {
		this.clickListener = clickListener;
	}
	
	// getter
	public ClickListener getClickListener() {
		return clickListener;
	}
	
	
	public void click() {
		this.clickListener.onClick();
	}
}
