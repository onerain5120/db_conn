package interfaceEx2;

public class InterfaceCImplTest {

	public static void main(String[] args) {
		
		InterfaceC cImpl = new InterfaceCImpl();

		cImpl.methodA();
		cImpl.methodB();
		cImpl.methodC();
	
		System.out.println("=========");
		
		InterfaceA ia = cImpl;
		ia.methodA();
		
		InterfaceB ib = cImpl;
		ib.methodB();
		
		InterfaceC ic = cImpl;
		ic.methodC();
	
	}
	
}



