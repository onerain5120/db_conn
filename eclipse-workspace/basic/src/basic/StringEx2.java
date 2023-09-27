package basic;

public class StringEx2 {
	public static void main(String[] args) {
		
		// 문자열을 다루는 문제는 중요
		
		// 일단 문자열 찾는 문제가 중요
		
		// 찾기 위해 정렬
		// 그러면 인덱싱 개념
		
		String subject = "자바 프로그래밍";
		
//		System.out.println(subject.indexOf("자"));
//		System.out.println(subject.indexOf("밍"));
//		System.out.println(subject.indexOf("하"));
		
		String taget = "프";
		
		if (subject.indexOf(taget) == -1) {
			System.out.println("그 글자 없네요");
		} else {
			System.out.println("찾았다.");
			System.out.println("그 위치는" + subject.indexOf(taget));
		}
		
		// 위는 글자 하나 찾을 때 쓰는 방법, 반대로 위치 넣어주고 해당 글자가 어떤 글자 먼저 나오게 하는 법
		
		
		System.out.println(subject.charAt(1));
		
		
		if(subject.charAt(1) == '바') {
			System.out.println("이것은 첫번째 글자");
		}
		
		System.out.println(subject.length());
		
		System.out.println(subject.replace("래", "레"));
		
		System.out.println(subject.substring(3));
		System.out.println(subject.length());
		System.out.println(subject.substring(3, 8));
		
		
		String strArrs[] = subject.split(" ");
		
		for(String strArr : strArrs) {
			System.out.println(strArr);
		}
		
	}
}
