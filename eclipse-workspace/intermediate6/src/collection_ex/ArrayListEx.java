package collection_ex;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx {
	
	public static void main(String[] args) {
		List<Board> arrayList = new ArrayList<>();
		
		arrayList.add(new Board("제목1", "내용1", "글쓴이1"));
		arrayList.add(new Board("제목2", "내용2", "글쓴이2"));
		arrayList.add(new Board("제목3", "내용3", "글쓴이3"));
		arrayList.add(new Board("제목4", "내용4", "글쓴이4"));
		arrayList.add(new Board("제목5", "내용5", "글쓴이5"));
		
		System.out.println(arrayList.size());
		
		arrayList.remove(4);
		
		
		for (Board board : arrayList) {
//			System.out.println(board);
			System.out.printf("%s, %s, %s \n", board.getSubject(), board.getContent(), board.getWriter());
		}
		
		
//		arrayList.add(new Board("제목6", "내용6", "글쓴이6"));
//
//		System.out.println(arrayList.size());

//		arrayList.add(0, null);

		
	}
}
