package cafe_v1;

public class Test {

	public static void main(String[] args) {
		StarCafe star= new StarCafe();
		BeanCafe bean= new BeanCafe();
		
		System.out.printf("~ %s에 오셨습니다 ~ \n아메리카노 : %d원, 라떼 : %d원 \n\n", star.name, star.amePrice, star.lattePrice);
		System.out.printf("~ %s에 오셨습니다 ~ \n아메리카노 : %d원, 라떼 : %d원 \n\n", bean.name, bean.amePrice, bean.lattePrice);

		System.out.println("--------------------------------");
		
		Person kim = new Person("Kim", 10000);
		kim.drinkStarAme(star); // 별 다방 아메리카노 구입
		
		System.out.println("--------------------------------");
		
		kim.drinkStarLatte(star); // 별 다방 라떼 구입
		
		System.out.println("--------------------------------");
		
		kim.drinkStarAme(star); // 별 다방 아메리카노 구입
		
		System.out.println("--------------------------------");

		Person lee = new Person("Lee", 8000);
		
		lee.drinkBeanLatte(bean);  // 콩 다방
		
		System.out.println("--------------------------------");
		
		lee.drinBbeanAme(bean);
		
		
		System.out.println("--------------------------------");
		
		lee.drinBbeanAme(bean);

	}
	
}
