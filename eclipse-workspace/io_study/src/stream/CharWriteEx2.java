package stream;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class CharWriteEx2 {
	
	public static void main(String[] args) {
		
		try {
			Writer writer = new FileWriter("test3.txt");
			
			char a = 'A';
			char b = 'B';
			char c = 'C';
			
			
			
			writer.write(a);
			writer.write(b);
			writer.write(c);
			
			char arr[] = {'D', 'E', 'F'};
			
			writer.write(arr);
			writer.write("GHI");
			
			writer.flush();
//			writer.close();
			
			writer.write("JKL");
			writer.flush();

			
			
			
		} catch (IOException e) {

			System.out.println("바이트데이터(텍스트 파일이 아닌 형태, 이미지 같은)로 만들어서 쓸 파일이 없는 예외");
		
		}

		
		
	}

}
