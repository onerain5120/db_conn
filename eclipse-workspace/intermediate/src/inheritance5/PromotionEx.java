package inheritance5;


class A{}

class B extends A{}

class C extends A{}

class D extends B{}

class E extends C{}





public class PromotionEx {
	
	public static void main(String[] args) {
		
		B b = new B();
		C c = new C();
		D d = new D();
		E e = new E();
		
		
		// 자동 타입변환    부모타입 참조변수 = 자식 타입 객체;
		
		A a1 = b;
		A a2 = c;
		A a3 = d;
		A a4 = e;
		
		
		B b1 = d;
		
		C c1 = e;
		
//		B b2 = e;    상속관계에 있지 않을 경우에는 컴파일 에러가 남
		
//		C c2 = d;
		
		
		System.out.println("=======================================");
		
		A a = new A();
		
		
		System.out.println(a);
		
		B bb = new B();
		System.out.println(bb);
		
		
		// 자동형변환
		A aa = bb;
		
		System.out.println(aa);
		
		
		System.out.println(aa==bb);
		
		
	}
}
