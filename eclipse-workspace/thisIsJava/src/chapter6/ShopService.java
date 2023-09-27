package chapter6;

public class ShopService {

	// 필
	private static ShopService singleton = new ShopService();
	
	
	// 생
	private ShopService() {
		
	}
	
	
	// 메
	public static ShopService getInstance() {
		return singleton;
	}

	
	
	
	public static void main(String[] args) {
		
		ShopService obj1 = ShopService.getInstance();
		ShopService obj2 = ShopService.getInstance();
		
		if(obj1 == obj2) {
			System.out.println("같은 ShopService 객체입니다.");
		} else {
			System.out.println("다른 ShopService 객체입니다.");
		}
		
		
	}
	
	
}
