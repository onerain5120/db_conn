package basic;

public class Example {
	public static void main(String[] args) {
		System.out.println("개발자가 되기 위한 필수 언어 개발 언어 Java");

		
		int lengthTop = 5;
        int lengthBottom = 10;
        int height = 7;
        
        double area = ((double)(lengthTop + lengthBottom) * height / 2);
        System.out.println(area);
        
        
        /***********************************************************************/
        
        // 1)
    	if(true) {
    		System.out.println("true");
    	}
    	
    	
    	// 2)
    	if(false) {
    		System.out.println("false");
    	} else {
    		System.out.println("true");
    	}
    	
    	// 3) 
    	if(false) {
    		System.out.println("false");
    	} else if(false) {
    		System.out.println("false");
    	} else {
    		System.out.println("true");
    	}
    	
    	
    	
    	for(int i = 0 ; i < 3 ; i++) {
    		System.out.println(i);
    	}
    	
    	
        
	}
	
	
	

}






