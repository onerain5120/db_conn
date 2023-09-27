package collection_ex;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetEx {

	
	public static void main(String[] args) {
		
		// set은 중복 X, 순서 X
		Set<String> set = new HashSet<>();
		
		
		set.add("Java");  // 집합에 추가하려면 add 메서드 사용
		set.add("SQL");
		set.add("JDBC");
		set.add("Spring");
		set.add("SpringBoot");
		
		// 향상된 for문
//		for(String i : set) {
//			System.out.println(i);
//		}
		
//		set.remove("JDBC");  // 집합에서 제거하려면 remove 메서드 사용
		
//		System.out.println("=================");
		
//		for(String i : set) {
//			System.out.println(i);
//		}
		
		// 객체를 하나씩 가져와서 처리
		
		// 객체를 돌리는 Iterator 인터페이스 사용(Set의 부모 인터페이스이므로 사용 가능)
		
		// Set 객체에서 Iterator()(반복자 객체를 반환) 메서드 사용 가능
		
		Iterator<String> iterator = set.iterator();
		
		while(iterator.hasNext()) {
			String str = iterator.next();
			System.out.println(str);
			
			if(str.equals("Spring") || str.equals("SQL") || str.equals("SpringBoot")) {
				iterator.remove();
			}
		}
		
		
		System.out.println("------- 삭제 후 -------");
		
		for(String i : set) {
			System.out.println(i);
		}
		
		
	}
}
