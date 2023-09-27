package generic_ex;

public class GenericTest {
	
	public static void main(String[] args) {
	
		Product<Tv, String> product1 = new Product<>();
		
//		Tv tv = new Tv();
//		product1.setKind(tv);
		
		product1.setKind(new Tv());  // setter 가져옴
		product1.setModel("스마트Tv");  // setter 가져옴
		
	
		Tv tv = product1.getKind();
		String tvModel = product1.getModel();
		
		System.out.println(tvModel);
		
		
		Product<Car, String> product2 = new Product<>();
		
		product2.setKind(new Car());
		product2.setModel("전기차");
		
		Car car = product2.getKind();
		String carModel = product2.getModel();
		
		System.out.println(carModel);
		
		
		
		
	}
}
