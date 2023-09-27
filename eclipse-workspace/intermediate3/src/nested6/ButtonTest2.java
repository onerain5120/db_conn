package nested6;

import nested6.Button.ClickListener;

public interface ButtonTest2 {
	
	public static void main(String[] args) {
		
		Button okbtn = new Button();
	
		//OK버튼(okbtn) 객체를 눌렀을 때 처리할 ClickListener 구현 클래스 
		
		
//		class OkListener implements ClickListener {
//
//			@Override
//			public void onClick() {
//				System.out.println("OK 버튼 클릭함");
//				
//			} 
//		}
				
		// 현재는 ClickListener 인터페이스 타입이 null이므로 ClickListener를 구현한
		// OkListener 클래스를 객체의 주소를 매개변수로 넣어서 설정 후에 클릭해야함
		okbtn.setClickListener(new ClickListener() {
			
			@Override
			public void onClick() {
				System.out.println("Ok 버튼 클릭함");
				
			}
		});
		
		okbtn.click();
		
		System.out.println("---------------------");
		
		Button cancelBtn = new Button();
		
		cancelBtn.setClickListener(new ClickListener() {
			
			@Override
			public void onClick() {
				// TODO Auto-generated method stub
				
			}
		});
	}

}
