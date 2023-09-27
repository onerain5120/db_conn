package basic6;

public class Earth {

	// 불변의 값 : 원주율 파이나 지구의 무게 및 둘레 등, 불변의 값 저장시 항상 상수를 사용하시는 습관을 들이시기 바랍니다.
	// 상수(constant) 자바에서는 static final , 관례적으로 상수명은 전체 대문자
	
	// 지구 반지름
	
	static final double EARTH_RADIUS = 6400;
	
	
	
	
	// 지구 면적
	
	static final double EATRH_SURCFAE_AREA;
	
	static {
		EATRH_SURCFAE_AREA = 4 * Math.PI * EARTH_RADIUS * EARTH_RADIUS;
	}
	
	
	
	
}
